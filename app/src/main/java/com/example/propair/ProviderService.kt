package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProviderService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_provider_service)

        val bckBtn = findViewById<TextView>(R.id.bck8)
        bckBtn.setOnClickListener {
            val intent= Intent(this, ProviderProfile::class.java)
            startActivity(intent)
        }
        val completeBtn = findViewById<Button>(R.id.button24)
        completeBtn.setOnClickListener {
            val intent= Intent(this, ProviderHome::class.java)
            startActivity(intent)
        }
    }
}