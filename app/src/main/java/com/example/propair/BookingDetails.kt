package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BookingDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_booking_details)
        val nxtBtn = findViewById<Button>(R.id.button8)
        nxtBtn.setOnClickListener {
            val intent= Intent(this, PaymentCard::class.java)
            startActivity(intent)
        }
        val bckBtn = findViewById<TextView>(R.id.bck3)
        bckBtn.setOnClickListener {
            val intent= Intent(this, CustomerBookings::class.java)
            startActivity(intent)
        }
    }
}