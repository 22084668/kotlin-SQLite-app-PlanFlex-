package com.example.planflex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class home_events : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_events)

        val btn2 = findViewById<Button>(R.id.button6)
        btn2.setOnClickListener {
            val Intent = Intent(this, homeScreen::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        val btn = findViewById<Button>(R.id.button8)
        btn.setOnClickListener {
            val Intent = Intent(this, home_setTask::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val btn3 = findViewById<ImageView>(R.id.profile)
        btn3.setOnClickListener {
            val Intent = Intent(this, user_profile::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

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