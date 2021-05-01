package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    //when activity is open onCreate executes the commands.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        //VARIABLES for username, password, backbutton, signupbutton
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val backbutton = findViewById<Button>(R.id.button2)
        val signupbutton = findViewById<Button>(R.id.login)
        //Email takes anything with @gmail.com, and password takes anything at, at least 8 characters minimum, only lowercase letters.
        signupbutton.setOnClickListener { if( !username.text.contains("@gmail.com") || password.text.length<8){
            //if login or password info not correct, message will pop up to say "Your login information is not correct."
            Toast.makeText(this, "Your login information is not correct.", Toast.LENGTH_SHORT).show()
        }
        //Connecting from LoginActivity.kt to the WelcomeActivity.kt
        else {   val i = Intent(this@LoginActivity, WelcomeActivity::class.java)
            startActivity(i)
        }
        }
        //Closing the loginActivity.kt
        backbutton.setOnClickListener { this.finish() }}}