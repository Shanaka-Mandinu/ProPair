package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)



        val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val passEditText = findViewById<EditText>(R.id.editTextTextPassword)

        fun validateEmail(): Boolean {
            val email = emailEditText.text.toString().trim()

            return when {
                email.isEmpty() -> {
                    emailEditText.error = "Email is required"
                    false
                }
                !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                    emailEditText.error = "Enter a valid email"
                    false
                }
                else -> {
                    emailEditText.error = null
                    true
                }
            }
        }
        fun validatePassword(): Boolean {
            val password = passEditText.text.toString()

            return when {
                password.isEmpty() -> {
                    passEditText.error = "Password is required"
                    false
                }
                password.length < 6 -> { // You can change to 8 if needed
                    passEditText.error = "Password must be at least 6 characters"
                    false
                }
                else -> {
                    passEditText.error = null
                    true
                }
            }
        }

        val lgnBtn = findViewById<Button>(R.id.lgnbtn)
        lgnBtn.setOnClickListener {
            if (validateEmail()&& validatePassword()) {
                val intent = Intent(this, CustomerHome::class.java)
                startActivity(intent)
            }
        }
    }
}