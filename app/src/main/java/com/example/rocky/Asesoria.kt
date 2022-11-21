package com.example.rocky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.rocky.R.id.*

class Asesoria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asesoria2)

        val btnAse: ImageButton = findViewById(imageButton7)
        btnAse.setOnClickListener {

            val intent: Intent = Intent(this,AsesoriaPrimerosP::class.java )
            startActivity(intent)

    }
  }
 }