package com.example.propair

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Signup1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup1)

        val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress2)
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
        val nameEditText = findViewById<EditText>(R.id.editTextText)

        fun validateName(): Boolean {
            val name = nameEditText.text.toString().trim()

            return if (name.isEmpty()) {
                nameEditText.error = "Name is required"
                false
            } else {
                nameEditText.error = null
                true
            }
        }



        val fillBtn = findViewById<Button>(R.id.fillbtn)
        fillBtn.setOnClickListener {
            if(validateName()&&validateEmail()) {
                val intent = Intent(this, Signup2::class.java)
                startActivity(intent)
            }
        }
    }
}