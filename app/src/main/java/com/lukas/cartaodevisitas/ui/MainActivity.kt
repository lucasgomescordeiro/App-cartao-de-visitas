package com.lukas.cartaodevisitas.ui

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lukas.cartaodevisitas.R
import com.lukas.cartaodevisitas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val  binding by lazy {ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}