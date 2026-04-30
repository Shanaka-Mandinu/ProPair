package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class BookingConfirm1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_booking_confirm1)

        val nxtBtn = findViewById<Button>(R.id.button4)
        nxtBtn.setOnClickListener {
            val intent= Intent(this, BookingConfirm2::class.java)
            startActivity(intent)
        }
        val bckBtn = findViewById<TextView>(R.id.bck1)
        bckBtn.setOnClickListener {
            val intent= Intent(this, CustomerSearch::class.java)
            startActivity(intent)
        }
    }
}