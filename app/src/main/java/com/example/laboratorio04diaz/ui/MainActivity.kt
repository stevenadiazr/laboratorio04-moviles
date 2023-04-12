package com.example.laboratorio04diaz.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.laboratorio04diaz.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: TextInputEditText
    private lateinit var actionNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.name_value)
        actionNext= findViewById(R.id.action_next)

        actionNext.setOnClickListener{
            val intent = Intent(this, ShareActivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())
            intent.putExtra("email", "edu@gmail.com")
            startActivity(intent)
        }
    }
    
    
}