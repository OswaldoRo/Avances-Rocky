package com.example.rocky.Ayudaaunamascota.adapter

import android.view.LayoutInflater
//import xml android
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rocky.Ayudaaunamascota.ClaseAyudaMascotas
import com.example.rocky.R

class AyudaMascotasAdapter(private val CentresAdoptionList:List<ClaseAyudaMascotas>) : RecyclerView.Adapter<AyudaMascotasViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AyudaMascotasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AyudaMascotasViewHolder(layoutInflater.inflate(R.layout.item_ayudamascota, parent, false))
    }

    override fun onBindViewHolder(holder: AyudaMascotasViewHolder, position: Int) {
        val item = CentresAdoptionList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = CentresAdoptionList.size
    }

