package com.example.laboratorio04diaz.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.laboratorio04diaz.R

class ShareActivity : AppCompatActivity() {

    private lateinit var nameTextView: TextView
    private lateinit var shareButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

        nameTextView = findViewById(R.id.name_text_view)
        shareButton = findViewById(R.id.share_button)

        val name = intent.getStringExtra("name").toString()

        nameTextView.text = name

        shareButton.setOnClickListener{
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "compartir")
                type = "text/plain"
            }
            startActivity(sendIntent)
        }


    }
}