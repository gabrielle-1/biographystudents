package com.example.flaggame.screens.game

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.flaggame.R

class About : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gabiButtom = findViewById<ImageButton>(R.id.gabiButtom)


        gabiButtom.setOnClickListener {
            val intent = Intent(this, AboutGabi::class.java)
            startActivity(intent)
        }

        val valmirButtom = findViewById<ImageButton>(R.id.valmirButtom)

        valmirButtom.setOnClickListener {
            val intent = Intent(this, AboutValmir::class.java)
            startActivity(intent)
        }

    }
}