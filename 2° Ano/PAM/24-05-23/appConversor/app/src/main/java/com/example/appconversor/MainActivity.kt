package com.example.appconversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var celciusRadioButton: RadioButton
    lateinit var fahreinheitRadioButton: RadioButton
    lateinit var converterButton: Button
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.valorTemp) as EditText
        celciusRadioButton = findViewById(R.id.celcius) as RadioButton
        fahreinheitRadioButton = findViewById(R.id.fahreinheit) as RadioButton
        converterButton = findViewById(R.id.converterButton) as Button
        resultado = findViewById(R.id.resultado) as TextView

        converterButton.setOnClickListener{converter()}
    }

    fun converter(){
        var numDigitado: Double = editText.text.toString().toDouble()

        if(celciusRadioButton.isChecked){
            var temp = (numDigitado-32) * 5/9
            editText.setText(temp.toString())
            resultado.setText("A conversão de ${numDigitado} Fahreinheit é igual a ${temp} Celsius")
        }else if(fahreinheitRadioButton.isChecked){
            var temp = numDigitado*9/5+32
            editText.setText(temp.toString())
            resultado.setText("A conversão de ${numDigitado} Celsius é igual a ${temp} Fahreinheit")
        }


    }

}