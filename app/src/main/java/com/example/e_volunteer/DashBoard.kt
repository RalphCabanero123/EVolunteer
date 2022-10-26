package com.example.e_volunteer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class DashBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val btnSidebar = findViewById<ImageButton>(R.id.sidebar)

        btnSidebar.setOnClickListener {
            val sidebarintent = Intent(this, DashBoard2::class.java)
            startActivity(sidebarintent)
        }
    }
}
