package com.example.rocky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btn1img: ImageButton = findViewById(R.id.imageButton1)
        btn1img.setOnClickListener {

            val intent: Intent = Intent(this,Asesoria::class.java )
            startActivity(intent)

    }
  }
}