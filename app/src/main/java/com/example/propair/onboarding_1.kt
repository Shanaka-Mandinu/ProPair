package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class onboarding_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding1)
        val ctnBtn = findViewById<Button>(R.id.btn1)
        ctnBtn.setOnClickListener {
            val intent= Intent(this, onboarding_2::class.java)
            startActivity(intent)
        }
        val skipBtn = findViewById<Button>(R.id.btn2)
        skipBtn.setOnClickListener {
            val intent= Intent(this, onboarding_3::class.java)
            startActivity(intent)
        }
    }
}