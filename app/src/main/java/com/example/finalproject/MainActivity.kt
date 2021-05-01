package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
// VARIABLE BUTTON
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_one)
        // Connecting to the button in the activity_page_one.XML file
        button = findViewById(R.id.button)
        button.setOnClickListener  {
            // Connecting from the MainActivity.kt to the LoginActivity.kt
            val i = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(i)} // brings up the second activity
        }
    }