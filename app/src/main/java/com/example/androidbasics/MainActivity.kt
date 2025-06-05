package com.example.androidbasics

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btnUpload = findViewById<Button>(R.id.btnUpload)
        val etUserName = findViewById<EditText>(R.id.etUserName)
        val etBirthData = findViewById<EditText>(R.id.etBirthDate)
        val etCountry = findViewById<EditText>(R.id.etCountry)
        val etPassword = findViewById<EditText>(R.id.etPassword)




        btnUpload.setOnClickListener {
            val userName = etUserName.text.toString()
            val birthData = etBirthData.text.toString()
            val country = etCountry.text.toString()
            val password = etPassword.text.toString()
            Toast.makeText(
                this,
                "Your Name is $userName and Birth Date is $birthData and Country is $country and Password is $password",
                Toast.LENGTH_LONG
            ).show()
        }

    }
}