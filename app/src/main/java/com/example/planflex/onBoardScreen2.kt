package com.example.planflex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class onBoardScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board_screen2)


        val btn2 = findViewById<Button>(R.id.button)
        btn2.setOnClickListener {
            val Intent = Intent(this, onBoardScreen3::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
            val Intent = Intent(this, onBoardScreen1::class.java)
            startActivity(Intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }
    }
    override fun onBackPressed() {
        val intent = Intent(this, onBoardScreen1::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)

        super.onBackPressed()
    }

}