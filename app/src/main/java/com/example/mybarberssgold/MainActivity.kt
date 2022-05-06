package com.example.mybarberssgold

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()  {
    var EditText = name,Pwd
    val button = login


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         name =(EditText)findViewById(R.id.Pwd)

         button =(button)findViewById(R.id.login)
    }

}