package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment_card)
        val nxtBtn = findViewById<Button>(R.id.button9)
        nxtBtn.setOnClickListener {
            val intent= Intent(this, PaymentSuccess::class.java)
            startActivity(intent)
        }
        val cashBtn = findViewById<ImageView>(R.id.imageView27)
        cashBtn.setOnClickListener {
            val intent= Intent(this, PaymentCash::class.java)
            startActivity(intent)
        }
        val bckBtn = findViewById<TextView>(R.id.bck5)
        bckBtn.setOnClickListener {
            val intent= Intent(this, BookingDetails::class.java)
            startActivity(intent)
        }
    }
}