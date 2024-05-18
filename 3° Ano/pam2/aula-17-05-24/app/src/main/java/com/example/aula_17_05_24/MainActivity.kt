package com.example.aula_17_05_24

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.aula_17_05_24.ui.theme.Aula170524Theme
import com.example.aula_17_05_24.ui.theme.B_Button
import com.example.aula_17_05_24.ui.theme.I_Button
import com.example.aula_17_05_24.ui.theme.Mb_Button
import com.example.aula_17_05_24.ui.theme.R_Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aula170524Theme {
                App()
            }
        }
    }
}

@Composable
fun NoteButton(
    text: String,
    buttonColors: ButtonColors = ButtonDefaults.buttonColors(),
    block: () -> Unit
){
    ElevatedButton(
        onClick = block,
        shape = RoundedCornerShape(5.dp),
        colors = buttonColors,
        modifier = Modifier.width(150.dp)
    ) {
        Text(text = text)
    }
}

@Composable
fun App(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                Modifier.padding(vertical = 2.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.logo_etec), contentDescription = "Logo da Etec")
            }

            Row(
                Modifier.padding(vertical = 10.dp)
            ){
                Text(
                    text = "ETEC DA ZONA LESTE",
                    fontSize = 5.em
                )
            }
            Row(
                Modifier.padding(vertical = 10.dp)
            ){
                var nome by remember { mutableStateOf("") }
                TextField(
                    value = nome,
                    onValueChange = {nome = it},
                    label = { Text(text = "Digite o seu nome: ")}
                )
            }

            Column(
                Modifier
                    .fillMaxHeight()
            ) {
                NoteButton(
                    text = "MB",
                    buttonColors = Mb_Button(),
                ) {
                    Log.i(TAG, "Clicou em MB")
                }
                Spacer(modifier = Modifier.size(15.dp))
                NoteButton(
                    text = "B",
                    buttonColors = B_Button(),
                ) {
                    Log.d(TAG, "Clicou em B")
                }
                Spacer(modifier = Modifier.size(15.dp))
                NoteButton(
                    text = "R",
                    buttonColors = R_Button(),
                ) {
                    Log.w(TAG, "Clicou em R")
                }
                Spacer(modifier = Modifier.size(15.dp))
                NoteButton(
                    text = "I",
                    buttonColors = I_Button(),
                ) {
                    Log.e(TAG, "Clicou em I")
                }
            }
        }
    }
}

@Preview
@Composable
fun AppPreview(){
    Aula170524Theme {
        App()
    }
}