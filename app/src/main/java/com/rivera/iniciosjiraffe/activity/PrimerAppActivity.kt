package com.rivera.iniciosjiraffe.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.rivera.iniciosjiraffe.R

class PrimerAppActivity : AppCompatActivity() {
    //Al arrancar la pantalla
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Consola: ", "Primer mensaje")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer_app)
        val botonLoguea = findViewById<AppCompatButton>(R.id.botonLoguea)
        val editTextMensaje = findViewById<AppCompatEditText>(R.id.editTextMensaje)


        botonLoguea.setOnClickListener {
            val editTextLog = editTextMensaje.text.toString()
            if(editTextLog.isNotEmpty()) {
                Log.i("Irving", "!Rendirse Jamas! $editTextLog")
            }

        }

    }
}