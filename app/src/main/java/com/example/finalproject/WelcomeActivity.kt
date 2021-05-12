package com.example.finalproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.databinding.WelcomePageBinding

class WelcomeActivity : AppCompatActivity () {
    //Create Binding
    private lateinit var binding: WelcomePageBinding

    //when activity is open onCreate executes the commands.
    override fun onCreate(savedInstanceState: Bundle?) {
        //Set binding to welcome page
        super.onCreate(savedInstanceState)
        binding = WelcomePageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Closing the WelcomeActiving and going back to the LoginActivity.kt
        binding.button3.setOnClickListener {
            //Closing Activity
             this.finish()
        }
    }
}