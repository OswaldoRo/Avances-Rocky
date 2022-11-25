package com.example.rocky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.rocky.Asesoria.Asesoria
import com.example.rocky.Asistencia.AsistenciaMascota
import com.example.rocky.Ayudaaunamascota.RecAyudaMascotas
import com.example.rocky.LoginActivity2



class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btn1img: ImageButton = findViewById(R.id.imageButton1)
        btn1img.setOnClickListener {

            val intent: Intent = Intent(this, Asesoria::class.java)
            startActivity(intent)
        }

        val btn2img: ImageButton = findViewById(R.id.imageButton4)
        btn2img.setOnClickListener {

            val intent: Intent = Intent(this, RecAyudaMascotas::class.java)
            startActivity(intent)
        }

        val btn3img: ImageButton = findViewById(R.id.imageButton5)
        btn3img.setOnClickListener {

            val intent: Intent = Intent(this, AsistenciaMascota::class.java)
            startActivity(intent)
        }


    }
  }
