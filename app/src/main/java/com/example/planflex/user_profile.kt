package com.example.planflex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class user_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val btn4 = findViewById<ImageView>(R.id.imageView3)
        btn4.setOnClickListener {
            val Intent = Intent(this, homeScreen::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        val btn5 = findViewById<ImageView>(R.id.imageView4)
        btn5.setOnClickListener {
            val Intent = Intent(this, info::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val btn6 = findViewById<ImageView>(R.id.imageView2)
        btn6.setOnClickListener {
            val Intent = Intent(this, shoppingList::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}