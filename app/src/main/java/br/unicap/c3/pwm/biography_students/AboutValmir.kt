package com.example.flaggame.screens.game

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.flaggame.R

class AboutValmir : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.valmir_about)
    }

    fun voltar(view: View) {
        val intent = Intent(this, About::class.java)
        startActivity(intent)
    }
}