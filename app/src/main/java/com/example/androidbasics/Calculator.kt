package com.example.androidbasics

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val etFirstNumber = findViewById<EditText>(R.id.etFirstNumber)
        val etSecondNumber = findViewById<EditText>(R.id.etSecondNumber)
        val tvResult = findViewById<TextView>(R.id.tvResult)


        btnAdd.setOnClickListener {
            var firstNumber = etFirstNumber.text.toString()
            var secondNumber = etSecondNumber.text.toString()
            var result = addition(firstNumber.toInt(), secondNumber.toInt())
            tvResult.text = "Result: $result"
        }

        btnSubtract.setOnClickListener {
            var firstNumber = etFirstNumber.text.toString()
            var secondNumber = etSecondNumber.text.toString()
            var result = subtract(firstNumber.toInt(), secondNumber.toInt())
            tvResult.text = "Result: $result"
        }

        btnMultiply.setOnClickListener {
            var firstNumber = etFirstNumber.text.toString()
            var secondNumber = etSecondNumber.text.toString()
            var result = multiply(firstNumber.toInt(), secondNumber.toInt())
            tvResult.text = "Result: $result"
        }

        btnDivide.setOnClickListener {
            var firstNumber = etFirstNumber.text.toString()
            var secondNumber = etSecondNumber.text.toString()
            var result = division(firstNumber.toInt(), secondNumber.toInt())
            tvResult.text = "Result: $result"
        }

    }


    fun addition(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }
    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }
    fun division(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}