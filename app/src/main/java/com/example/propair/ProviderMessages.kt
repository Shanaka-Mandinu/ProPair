package com.example.propair

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProviderMessages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_provider_messages)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView2)
        bottomNavigationView.selectedItemId = R.id.pro_msg

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.pro_dash -> {
                    startActivity(Intent(applicationContext, ProviderHome::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                R.id.pro_jobs -> {
                    startActivity(Intent(applicationContext, ProviderJobsNew::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                R.id.pro_msg -> {

                    true
                }
                R.id.pro_profile -> {
                    startActivity(Intent(applicationContext, ProviderProfile::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}