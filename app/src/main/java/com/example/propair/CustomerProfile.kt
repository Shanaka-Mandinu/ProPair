package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class CustomerProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_customer_profile)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.bottom_profile

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    startActivity(Intent(applicationContext, CustomerHome::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
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

                    true
                }
                else -> false
            }
        }

        val lgBtn = findViewById<Button>(R.id.button13)
        lgBtn.setOnClickListener {
            val intent= Intent(this, Login::class.java)
            startActivity(intent)
        }
        val switchBtn = findViewById<Button>(R.id.button12)
        switchBtn.setOnClickListener {
            val intent= Intent(this, ProviderProfile::class.java)
            startActivity(intent)
        }
    }
}