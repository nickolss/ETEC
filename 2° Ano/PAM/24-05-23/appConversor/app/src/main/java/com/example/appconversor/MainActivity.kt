package com.example.appconversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var celsiusRadioButton: RadioButton
    lateinit var fahreinheitRadioButton: RadioButton
    lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.valorTemp) as EditText

        celsiusRadioButton = findViewById(R.id.celsiusRadio) as RadioButton
        fahreinheitRadioButton = findViewById(R.id.fahreinheitRadio) as RadioButton

        convertButton = findViewById(R.id.converterButton) as Button
        convertButton.setOnClickListener{converter()}
    }

    fun converter(){
        var temp : Double = editText.toString().toDouble()

        if(celsiusRadioButton.isChecked){
            temp = (temp - 32)* 5/9
        }else if(fahreinheitRadioButton.isChecked){
            temp = temp*9/5+32
        }
        editText.setText(temp.toString())
    }

}