package com.example.rocky.Asesoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.rocky.Menu
import com.example.rocky.R
import com.example.rocky.R.id.*

class Asesoria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asesoria2)

        val btnAse: ImageButton = findViewById(imageButton)
        btnAse.setOnClickListener {

            val intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)

        }


        val btnAse1: ImageButton = findViewById(imageButton7)
        btnAse1.setOnClickListener {

            val intent1: Intent = Intent(this, AsesoriaPrimerosP::class.java)
            startActivity(intent1)


        }

                val btnAse2: ImageButton = findViewById(botonsan)
                btnAse2.setOnClickListener {

                   val intent3: Intent = Intent(this, AsesoriaHabilidades::class.java)
                    startActivity(intent3)

                }

                    val btnAse4: ImageButton = findViewById(imageButton8)
                    btnAse4.setOnClickListener {

                    val intent4: Intent = Intent(this, AsesoriaHigiene::class.java)
                    startActivity(intent4)

              }
           }
         }
