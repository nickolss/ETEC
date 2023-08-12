package com.example.aplicacaojetpack

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aplicacaojetpack.ui.theme.AplicacaoJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Mensagem("Android" , "Jetpack Compose"))
        }
    }
}

data class Mensagem(val autor:String, val body: String)

@Composable
fun MessageCard(msg: Mensagem){

    //Column permite dispor os elementos VERTICALMENTE
    Column {
        Text(text = msg.autor)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = msg.body)
    }

    //Row permite dispor os elementos HORIZONTALMENTE
    Row (modifier = Modifier.padding(all = 36.dp)){//Isso significa que todos os elementos ter'ao um padding de 36.dp
        Image(painter = painterResource(R.drawable.pinguim),
            contentDescription = "Servico de Manutencao",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

    }
}


@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(msg = Mensagem("Android" , "Jetpack Compose"))
}