package com.example.planflex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class onBoardScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board_screen3)


        val btn1 = findViewById<Button>(R.id.button3)
        btn1.setOnClickListener {
            val Intent = Intent(this, onBoardScreen2::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }
        val btn2 = findViewById<Button>(R.id.button)
        btn2.setOnClickListener {
            val Intent = Intent(this, personal_details_input::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }


    }
    override fun onBackPressed() {
        val intent = Intent(this, onBoardScreen2::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)

        super.onBackPressed()
    }
}