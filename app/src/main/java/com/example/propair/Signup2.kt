package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup2)
        val verifyBtn = findViewById<Button>(R.id.vrfyBtn)
        verifyBtn.setOnClickListener {
            val intent= Intent(this, Signup3::class.java)
            startActivity(intent)
        }
    }
}