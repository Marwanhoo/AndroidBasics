package com.example.androidbasics

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val btnActivityImageViewExample = findViewById<Button>(R.id.btnActivityImageViewExample)
        val btnActivityCalculator = findViewById<Button>(R.id.btnActivityCalculator)

        btnActivityImageViewExample.setOnClickListener {
            val intent = Intent(this, ImageViewExample::class.java)
            startActivity(intent)
        }

        btnActivityCalculator.setOnClickListener {
            val intent = Intent(this, Calculator::class.java)
            startActivity(intent)
        }

    }
}