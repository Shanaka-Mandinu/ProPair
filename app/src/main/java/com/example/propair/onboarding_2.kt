package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class onboarding_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding2)
        val nxtBtn = findViewById<Button>(R.id.btn3)
        nxtBtn.setOnClickListener {
            val intent= Intent(this, onboarding_3::class.java)
            startActivity(intent)
        }
        val skipBtn = findViewById<Button>(R.id.btn4)
        skipBtn.setOnClickListener {
            val intent= Intent(this, onboarding_3::class.java)
            startActivity(intent)
        }
    }
}