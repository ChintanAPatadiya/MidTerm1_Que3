package com.example.midterm_q3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity1 : AppCompatActivity() {
    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var resultTextView: TextView
    private lateinit var addButton: Button
    private lateinit var subtractButton: Button
    private lateinit var multiplyButton: Button
    private lateinit var divideButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        num1EditText = findViewById(R.id.num1_edit_text)
        num2EditText = findViewById(R.id.num2_edit_text)
        resultTextView = findViewById(R.id.result_text_view)
        addButton = findViewById(R.id.add_button)
        subtractButton = findViewById(R.id.subtract_button)
        multiplyButton = findViewById(R.id.multiply_button)
        divideButton = findViewById(R.id.divide_button)

        addButton.setOnClickListener { performOperation("+") }
        subtractButton.setOnClickListener { performOperation("-") }
        multiplyButton.setOnClickListener { performOperation("*") }
        divideButton.setOnClickListener { performOperation("/") }
    }

    private fun performOperation(operator: String) {
        val num1 = num1EditText.text.toString().toDouble()
        val num2 = num2EditText.text.toString().toDouble()
        var result = 0.0

        when (operator) {
            "+" -> result = num1 + num2
            "-" -> result = num1 - num2
            "*" -> result = num1 * num2
            "/" -> {
                if (num2 != 0.0) {
                    result = num1 / num2
                } else {
                    resultTextView.text = "Error: Division by zero!"
                    return
                }
            }
        }

        resultTextView.text = result.toString()
    }
}