package com.example.aula_19_04_24.components

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun simpleTextField(){
    var text by remember { mutableStateOf("") }

    TextField(value = text, onValueChange = {novoValor -> text = novoValor}, label = { Text(text = "Nome")})
    //TextField(value = text, onValueChange = {text = it}, label = { Text(text = "Nome")})
}