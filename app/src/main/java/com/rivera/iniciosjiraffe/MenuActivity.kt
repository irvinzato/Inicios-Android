package com.rivera.iniciosjiraffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.rivera.iniciosjiraffe.activity.PrimerAppActivity
import com.rivera.iniciosjiraffe.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Vinculo con .xml
        val botonSaludarApp = findViewById<Button>(R.id.btnSaludarApp)
        botonSaludarApp.setOnClickListener{ navegarSaludarApp() }

        val botonIMCApp = findViewById<Button>(R.id.btnIMCApp)
        botonIMCApp.setOnClickListener { navegarAImcApp() }
    }

    private fun navegarAImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navegarSaludarApp() {
        val intent = Intent(this, PrimerAppActivity::class.java)
        startActivity(intent)
    }
}