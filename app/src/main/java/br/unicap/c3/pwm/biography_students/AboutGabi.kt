package com.example.flaggame.screens.game

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.flaggame.R

class AboutGabi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gabi_about)
    }

    fun voltar(view: View) {
        val intent =Intent(this, About::class.java)
        startActivity(intent)
    }

}