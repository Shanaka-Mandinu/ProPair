package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProviderHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_provider_home)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView2)
        bottomNavigationView.selectedItemId = R.id.pro_dash

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.pro_dash -> {
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
                    startActivity(Intent(applicationContext, ProviderProfile::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }

                else -> false
            }
        }

        val switchBtn = findViewById<Button>(R.id.button16)
        switchBtn.setOnClickListener {
            val intent= Intent(this, CustomerHome::class.java)
            startActivity(intent)
        }

    }
}