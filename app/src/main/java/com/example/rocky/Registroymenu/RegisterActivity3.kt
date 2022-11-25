package com.example.rocky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.rocky.Registroymenu.LoginActivity2

class RegisterActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register3)

        val btn: Button = findViewById(R.id.btn_AtrasRegister)
        btn.setOnClickListener {

            val intent = Intent(this, LoginActivity2::class.java)
            startActivity(intent)

        }


    }
}