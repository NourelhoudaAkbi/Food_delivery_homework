package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome_screen.signinBtn

class welcome_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)
        signinBtn.setOnClickListener {
            val i = Intent(this@welcome_screen, HomeScreen::class.java)
            startActivity(i)
        }
    }
}