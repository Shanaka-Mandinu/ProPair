package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProviderProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_provider_profile)

        val lgBtn = findViewById<Button>(R.id.button15)
        lgBtn.setOnClickListener {
            val intent= Intent(this, Login::class.java)
            startActivity(intent)
        }
        val switchBtn = findViewById<Button>(R.id.button14)
        switchBtn.setOnClickListener {
            val intent= Intent(this, CustomerProfile::class.java)
            startActivity(intent)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView2)
        bottomNavigationView.selectedItemId = R.id.pro_profile

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
                    startActivity(Intent(applicationContext, ProviderMessages::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                R.id.pro_profile -> {

                    true
                }

                else -> false
            }
        }

        val setBtn = findViewById<ImageView>(R.id.imageView48)
        setBtn.setOnClickListener {
            val intent= Intent(this, ProviderService::class.java)
            startActivity(intent)
        }

    }
}