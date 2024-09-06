package com.friska.lat4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText: EditText = findViewById(R.id.emailEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
        val loginButton: Button = findViewById(R.id.loginButton)
        val forgotPassword: TextView = findViewById(R.id.forgotPassword)
        val signUpText: TextView = findViewById(R.id.signUpText)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Handle login logic here
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
            }
        }

        forgotPassword.setOnClickListener {
            Toast.makeText(this, "Forgot Password Clicked", Toast.LENGTH_SHORT).show()
        }

        signUpText.setOnClickListener {
            Toast.makeText(this, "Sign Up Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
