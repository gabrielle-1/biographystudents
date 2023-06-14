package br.unicap.c3.pwm.biography_students

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gabiButtom = findViewById<ImageButton>(R.id.gabiButtom)

        gabiButtom.setOnClickListener {
            val intent = Intent(this, AboutGabi::class.java)
            startActivity(intent)
        }

    }
}