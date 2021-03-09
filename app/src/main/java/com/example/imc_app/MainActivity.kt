package com.example.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setlisteners()
    }
    private fun setlisteners(){
        calcularBTN.setOnClickListener(){
            calcularImc(pesoEDT.text.toString(),alturaEDT.text.toString())
        }
    }
    private fun calcularImc(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null){
            val imc = peso /(altura*altura)
            tituloTXT.text = "Seu IMC:\n%.2f".format(imc)
        }
    }
}