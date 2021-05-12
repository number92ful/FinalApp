package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.databinding.ActivityPageOneBinding

class MainActivity : AppCompatActivity() {
// Create Binding
    private lateinit var binding: ActivityPageOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Set binding to Activity Page One
        binding = ActivityPageOneBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // Reference Button from the binding
        binding.button.setOnClickListener  {
            // Connecting from the MainActivity.kt to the LoginActivity.kt
            val i = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(i)} // brings up the second activity
        }
    }