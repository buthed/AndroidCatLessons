package com.example.day3_count_of_birds

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var mButton: Button
    private lateinit var mButtonCounter: Button
    private lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        var counter: Int = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton = findViewById(R.id.button)
        mButtonCounter = findViewById(R.id.button_counter)
        textView = findViewById(R.id.textView)

        mButton.setOnClickListener{
            mButton.text = "Нравится считать?"
            mButton.setBackgroundColor(Color.RED)
        }

        mButtonCounter.setOnClickListener {
            textView.text = "Я насчитал ${++counter} ворон"
        }


    }
}