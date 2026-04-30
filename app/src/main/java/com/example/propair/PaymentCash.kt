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

class PaymentCash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment_cash)
        val nxtBtn = findViewById<Button>(R.id.button10)
        nxtBtn.setOnClickListener {
            val intent= Intent(this, CustomerHome::class.java)
            startActivity(intent)
        }
        val cardBtn = findViewById<ImageView>(R.id.imageView28)
        cardBtn.setOnClickListener {
            val intent= Intent(this, PaymentCard::class.java)
            startActivity(intent)
        }
        val bckBtn = findViewById<TextView>(R.id.bck6)
        bckBtn.setOnClickListener {
            val intent= Intent(this, BookingDetails::class.java)
            startActivity(intent)
        }
    }
}