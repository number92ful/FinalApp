package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.databinding.ActivityLoginBinding

class LoginActivity: AppCompatActivity() {
    //when activity is open onCreate executes the commands.
    //Create binding
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Set Binding to Activity Login
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Email takes anything with @gmail.com, and password takes anything at, at least 8 characters minimum, only lowercase letters.
        binding.login.setOnClickListener { if( !binding.username.text.contains("@gmail.com") || binding.password.text.length<8){
            //if login or password info not correct, message will pop up to say "Your login information is not correct."
            Toast.makeText(this, "Your login information is not correct.", Toast.LENGTH_SHORT).show()
        }
        //Connecting from LoginActivity.kt to the WelcomeActivity.kt
        else {   val i = Intent(this@LoginActivity, WelcomeActivity::class.java)
            startActivity(i)
        }
        }
        //Closing the loginActivity.kt
        binding.backtomain.setOnClickListener { this.finish() }}}