package com.rivera.iniciosjiraffe.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rivera.iniciosjiraffe.R

class PrimerAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Consola: ", "Primer mensaje")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer_app)
        //Al arrancar la pantalla
    }
}