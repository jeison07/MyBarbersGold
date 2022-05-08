package com.example.mybarberssgold

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val texusuario = findViewById<TextView>(R.id.textIniciarSesion)
        texusuario.setOnClickListener() {
            val ventanainiciarSecion = Intent(this, MainActivity::class.java)
            startActivity(ventanainiciarSecion)
        }
    }


}