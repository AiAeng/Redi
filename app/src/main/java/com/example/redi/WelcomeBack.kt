package com.example.redi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeBack : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_back)

        val signUp: TextView = findViewById(R.id.SignUp)

        signUp.setOnClickListener{
            val intent2 = Intent(this, CreateAnAccount::class.java)
            startActivity(intent2)
        }
    }
}