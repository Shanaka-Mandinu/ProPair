package com.example.propair

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splashscreen)

        lifecycleScope.launch {

            kotlinx.coroutines.delay(4000) // 50 seconds = 50,000 ms
            val intent = Intent(this@MainActivity, onboarding_1::class.java)
            startActivity(intent)
            finish()
        }
    }
}