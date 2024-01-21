package com.rivera.iniciosjiraffe.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.rivera.iniciosjiraffe.R

class ResultActivity : AppCompatActivity() {
    //Para navegar entra pantallas necesito un "intent"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)
        //Con -> intent.extras["EXTRA_NAME"] no especificamos que planeamos obtener, puede ser lo que sea
        val texto_pasado: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        textViewResult.text = "Hola $texto_pasado"
    }
}