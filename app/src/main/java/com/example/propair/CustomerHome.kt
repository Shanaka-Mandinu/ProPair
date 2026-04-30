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
import com.google.android.material.bottomnavigation.BottomNavigationView

class CustomerHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_customer_home)
        val lgnImage = findViewById<ImageView>(R.id.imgServ)
        lgnImage.setOnClickListener {
            val intent = Intent(this, CustomerSearch::class.java)
            startActivity(intent)
        }
        val switchBtn = findViewById<Button>(R.id.button2)
        switchBtn.setOnClickListener {
            val intent= Intent(this, ProviderHome::class.java)
            startActivity(intent)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.bottom_home

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    true
                }
                R.id.bottom_search -> {
                    startActivity(Intent(applicationContext, CustomerSearch::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                R.id.bottom_jobs -> {
                    startActivity(Intent(applicationContext, CustomerBookings::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                R.id.bottom_msg -> {
                    startActivity(Intent(applicationContext, CustomerMessages::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                R.id.bottom_profile -> {
                    startActivity(Intent(applicationContext, CustomerProfile::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}