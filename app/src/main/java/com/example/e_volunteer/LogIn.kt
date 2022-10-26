package com.example.e_volunteer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_in)
        // Login Button
        val btnLogin = findViewById<Button>(R.id.btnlogin)

        btnLogin.setOnClickListener {
            val loginintent = Intent(this, DashBoard::class.java)
            startActivity(loginintent)
        }

        //Signup
        val signUp = findViewById<Button>(R.id.signup)

        signUp.setOnClickListener {
            val signupintent = Intent(this, Registration::class.java)
            startActivity(signupintent)
        }

    }

    fun onMatch(view: View) {
        // 2nd, Name and password matching function.
        val textName = findViewById<EditText>(R.id.editTextTextPersonName)
        val textPass = findViewById<EditText>(R.id.editTextTextPassword)


        if (textName.text.toString() == "admin" && textPass.text.toString() == "admin") {


            Toast.makeText(this, "login Successfully.", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "login failed", Toast.LENGTH_LONG).show()
        }
    }
}

