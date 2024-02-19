package com.example.anew

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn =findViewById<Button>(R.id.btn).setOnClickListener {
        val txt =findViewById<TextView>(R.id.txt)
        txt.text="Clicked"
        txt.setTextColor(R.color.black)
            val layout = findViewById<ConstraintLayout>(R.id.layout)
            layout.setBackgroundColor(R.color.black)




        }
    }
}