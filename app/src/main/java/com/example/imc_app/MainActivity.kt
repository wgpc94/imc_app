package com.example.imc_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

private var imc:Float = 0.0f

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
    private fun openNewActivity(){
        val intentEnviadora = Intent(this,ResultActivity::class.java)
            intentEnviadora.putExtra("resultado", imc)
            startActivity(intentEnviadora)

    }

    private fun calcularImc(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null){
            imc = peso /(altura*altura)
            openNewActivity()
        }
    }

}