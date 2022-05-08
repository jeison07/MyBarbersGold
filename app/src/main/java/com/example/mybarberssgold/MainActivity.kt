package com.example.mybarberssgold

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley





    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            val registrarse = findViewById<TextView>(R.id.registra)
            val cajaEmail = findViewById<EditText>(R.id.name)
            val cajaPass = findViewById<EditText>(R.id.textPwd)
            val bntsecion = findViewById<Button>(R.id.login)
            val url = "http://localhost/login/sencion.php"
            val queue = Volley.newRequestQueue(this)


            registrarse.setOnClickListener() {
                val ventanaRegistro = Intent(this, MainActivity2::class.java)
                startActivity(ventanaRegistro)
            }
        }


    }






