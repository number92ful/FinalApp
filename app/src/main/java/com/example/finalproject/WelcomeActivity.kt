package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity () {
    //Variable Button
    private lateinit var button: Button

    //when activity is open onCreate executes the commands.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_page)
        //Closing the WelcomeActiving and going back to the LoginActivity.kt
        button = findViewById(R.id.button3)
        button.setOnClickListener {
            //Closing Activity
             this.finish()
        }
    }
}