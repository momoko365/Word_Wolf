package com.example.wordwolf

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var start = findViewById<Button>(R.id.start_btn)
        var back =findViewById<Button>(R.id.next_btn)

        start.setOnClickListener {

        }

    }
}