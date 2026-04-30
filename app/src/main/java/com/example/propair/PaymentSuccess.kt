package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment_success)
        val nxtBtn = findViewById<Button>(R.id.button11)
        nxtBtn.setOnClickListener {
            val intent= Intent(this, CustomerHome::class.java)
            startActivity(intent)
        }
    }
}