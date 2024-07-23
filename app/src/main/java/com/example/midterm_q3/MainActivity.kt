package com.example.midterm_q3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button 1: Call Activity1
        val button1 = findViewById<Button>(R.id.que1_button)
        button1.setOnClickListener {
            val intent = Intent(this, Activity1::class.java)
            intent.putExtra("KEY1", "Value1")
            intent.putExtra("KEY2", 123)
            startActivity(intent)
        }

        // Button 2: Call Activity2
        val button2 = findViewById<Button>(R.id.que2_button)
        button2.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("KEY3", "Value3")
            intent.putExtra("KEY4", true)
            startActivity(intent)
        }
    }
}