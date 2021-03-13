package com.example.day4_traffic_light

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        red_button.setOnClickListener {
            textView.text = "Красный"
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                root_layout.setBackgroundColor(resources.getColor(R.color.redColor, null))
            }
        }

        yellow_button.setOnClickListener {
            textView.text = "Желтый"
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                root_layout.setBackgroundColor(resources.getColor(R.color.yellowColor, null))
            }
        }

        green_button.setOnClickListener {
            textView.text = "Зеленый"
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                root_layout.setBackgroundColor(resources.getColor(R.color.greenColor, null))
            }
        }
    }
}