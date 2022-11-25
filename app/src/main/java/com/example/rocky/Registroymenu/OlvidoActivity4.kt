package com.example.rocky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.rocky.Registroymenu.confirmaActivity5

class OlvidoActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olvido4)

        val btn: Button = findViewById(R.id.btn_aceptarOlv)
        btn.setOnClickListener {

            val intent = Intent(this, confirmaActivity5::class.java)
            startActivity(intent)

        }


    }
}