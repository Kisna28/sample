package com.example.sample

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signup = findViewById<TextView>(R.id.signin_notaccount)
        val signup1 = findViewById<TextView>(R.id.sign_up)

        signup.setOnClickListener{
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }
        signup1.setOnClickListener{
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }

    }
    }
