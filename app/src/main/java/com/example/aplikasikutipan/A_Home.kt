package com.example.aplikasikutipan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class A_Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_home)

        val btnEinstein = findViewById<Button>(R.id.btnEinstein)
        val btnNicola = findViewById<Button>(R.id.btnNicola)

        btnEinstein.setOnClickListener {
            val intent = Intent(this, A_Einstein::class.java)
            startActivity(intent)
        }

        btnNicola.setOnClickListener {
            val intent = Intent(this, A_Nicola::class.java)
            startActivity(intent)
        }
    }
}