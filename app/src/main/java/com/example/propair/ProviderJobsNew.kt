package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProviderJobsNew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_provider_jobs_new)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView2)
        bottomNavigationView.selectedItemId = R.id.pro_jobs

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.pro_dash -> {
                    startActivity(Intent(applicationContext, ProviderHome::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                R.id.pro_jobs -> {

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

        val switchBtn = findViewById<Button>(R.id.button19)
        switchBtn.setOnClickListener {
            val intent= Intent(this, ProviderJobsAccepted::class.java)
            startActivity(intent)
        }

        val switchBtn2 = findViewById<Button>(R.id.button23)
        switchBtn2.setOnClickListener {
            val intent= Intent(this, ProviderJobsAccepted::class.java)
            startActivity(intent)
        }
    }
}