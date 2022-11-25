package com.example.rocky.Asesoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.rocky.Menu
import com.example.rocky.R

class AsesoriaHabilidades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asesoria_habilidades)

        val botonatras2: ImageButton = findViewById(R.id.botonatras2)
        botonatras2.setOnClickListener {

            val intenta2: Intent = Intent(this, Asesoria::class.java)
            startActivity(intenta2)
        }
    }
}