package com.example.planflex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val btn4 = findViewById<ImageView>(R.id.imageView3)
        btn4.setOnClickListener {
            val Intent = Intent(this, homeScreen::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val btn = findViewById<ImageView>(R.id.profile)
        btn.setOnClickListener {
            val Intent = Intent(this, user_profile::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }


}