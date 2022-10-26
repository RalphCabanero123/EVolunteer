package com.example.e_volunteer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)

        val btnNext = findViewById<Button>(R.id.next)

        btnNext.setOnClickListener{
            val nextintent= Intent(this, DashBoard::class.java)
            startActivity(nextintent)
    }
}
fun onMatch(view: View) {
    // 2nd, Name and password matching function.
    val textName = findViewById<EditText>(R.id.editTextTextPersonName2)
    val lastName = findViewById<EditText>(R.id.lastName)
    val email = findViewById<EditText>(R.id.email)
    val password = findViewById<EditText>(R.id.editTextTextPassword2)
    val address = findViewById<EditText>(R.id.address)
    val birthDate = findViewById<EditText>(R.id.birthDate)
    val phoneNumber = findViewById<EditText>(R.id.phoneNumber)



}
}

