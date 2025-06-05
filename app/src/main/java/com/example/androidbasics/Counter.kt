package com.example.androidbasics

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Counter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_counter)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val tvCounterApp = findViewById<TextView>(R.id.tvCounterApp)
        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnIncrement = findViewById<Button>(R.id.btnIncrement)
        val btnDecrement = findViewById<Button>(R.id.btnDecrement)


        var counter = 0
        tvCounter.text = "$counter"

        btnIncrement.setOnClickListener {
            counter++;
            tvCounter.text = "$counter"
        }

        btnDecrement.setOnClickListener {
            if(counter > 0){
                counter --;
            }else{
                Toast.makeText(this, "Counter can't be negative", Toast.LENGTH_SHORT).show()
            }

            tvCounter.text = "$counter"

        }



    }
}