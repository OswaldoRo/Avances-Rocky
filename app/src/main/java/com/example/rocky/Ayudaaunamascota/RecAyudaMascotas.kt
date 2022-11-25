package com.example.rocky.Ayudaaunamascota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rocky.Ayudaaunamascota.adapter.AyudaMascotasAdapter
import com.example.rocky.R


class RecAyudaMascotas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_ayuda_mascotas)
        initRecyclerView()
    }

    fun initRecyclerView(){
    val recyclerView = findViewById<RecyclerView>(R.id.RecyclerAyudaMascotas)
    recyclerView.layoutManager = LinearLayoutManager(this)
    recyclerView.adapter = AyudaMascotasAdapter(AyudaMascotasProvider.CentresAdoptionList)

}

}