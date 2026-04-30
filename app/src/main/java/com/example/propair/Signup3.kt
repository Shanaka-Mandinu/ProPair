package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Signup3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup3)

        val passwordEditText = findViewById<EditText>(R.id.editTextTextPassword2)
        val confirmPasswordEditText = findViewById<EditText>(R.id.editTextTextPassword3)

        fun validatePasswords(): Boolean {
            val password = passwordEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()

            return when {
                password.isEmpty() -> {
                    passwordEditText.error = "Password is required"
                    false
                }
                password.length < 6 -> { // can change to 8 or more
                    passwordEditText.error = "Password must be at least 6 characters"
                    false
                }
                confirmPassword.isEmpty() -> {
                    confirmPasswordEditText.error = "Please confirm your password"
                    false
                }
                password != confirmPassword -> {
                    confirmPasswordEditText.error = "Passwords do not match"
                    false
                }
                else -> {
                    passwordEditText.error = null
                    confirmPasswordEditText.error = null
                    true
                }
            }
        }


        val crtBtn = findViewById<Button>(R.id.crtBtn)
        crtBtn.setOnClickListener {
            if (validatePasswords()) {
                val intent = Intent(this, CustomerHome::class.java)
                startActivity(intent)
            }
        }
    }
}