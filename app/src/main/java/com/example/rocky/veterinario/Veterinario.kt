package com.example.rocky.veterinario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rocky.databinding.ActivityVeterinarioBinding
import com.google.android.material.transition.MaterialSharedAxis.Axis

class Veterinario : AppCompatActivity() {

    private lateinit var binding:ActivityVeterinarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVeterinarioBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}