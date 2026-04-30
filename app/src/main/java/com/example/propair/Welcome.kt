package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)
        val loginBtn = findViewById<Button>(R.id.btn7)
        loginBtn.setOnClickListener {
            val intent= Intent(this, Login::class.java)
            startActivity(intent)
        }
        val signBtn = findViewById<Button>(R.id.btn6)
        signBtn.setOnClickListener {
            val intent= Intent(this, Signup1::class.java)
            startActivity(intent)
        }
    }
}