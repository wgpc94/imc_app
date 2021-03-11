package com.example.imc_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val intent: Intent = intent
        val parametros: Bundle? = intent.extras

        if (parametros != null){
            val resultado = parametros.getFloat("resultado")
            resultadoTXT.text = "Seu imc e de:\n %.2f".format(resultado)
            if (resultado<18.5){
                Toast.makeText(this, "Baixo peso", Toast.LENGTH_SHORT).show()
            }
            if (resultado>18.5 && resultado<24.9){
                Toast.makeText(this, "Peso normal", Toast.LENGTH_SHORT).show()
            }
            if (resultado>25.0 && resultado<29.9){
                Toast.makeText(this, "Pre obesidade", Toast.LENGTH_SHORT).show()
            }
            if (resultado>30.0 && resultado<34.9){
                Toast.makeText(this, "Obesidade grau 1", Toast.LENGTH_SHORT).show()
            }
            if (resultado>35.0 && resultado<39.9){
                Toast.makeText(this, "Obesidade grau 2", Toast.LENGTH_SHORT).show()
            }
            if(resultado>40.0){
                Toast.makeText(this, "Obesidade grau 3", Toast.LENGTH_SHORT).show()
            }

        }
    }


}



