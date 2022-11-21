package com.example.rocky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.Boton_inicio)
        btn1.setOnClickListener {

            val intent: Intent = Intent(this,Menu::class.java )
            startActivity(intent)
        }
    }
}