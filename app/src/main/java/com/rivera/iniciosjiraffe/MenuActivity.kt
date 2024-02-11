package com.rivera.iniciosjiraffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.rivera.iniciosjiraffe.activity.PrimerAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Vinculo con .xml
        val botonSaludarApp = findViewById<Button>(R.id.btnSaludarApp)
        botonSaludarApp.setOnClickListener{ navegarSaludarApp() }
    }

    private fun navegarSaludarApp() {
        val intent = Intent(this, PrimerAppActivity::class.java)
        startActivity(intent)
    }
}