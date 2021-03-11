package com.example.imc_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val intent: Intent = getIntent()
        val parametros: Bundle? = intent.extras

        if (parametros != null){
            val resultado = parametros.getFloat("resultado")
            resultadoTXT.text = "Seu imc e de:\n%.2f".format(resultado)
        }
    }


}



