package com.example.planflex

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIMEOUT: Long = 3000 // 3 seconds

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fadeIn: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_in_from_bottom)
        val clockAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_in_from_bottom)
        val planflexAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_in_from_left)
        val textFade: Animation= AnimationUtils.loadAnimation(this,R.anim.fade_in)

        // Apply animations to ImageViews
        findViewById<ImageView>(R.id.list).startAnimation(fadeIn)
        findViewById<ImageView>(R.id.clock).startAnimation(clockAnimation)
        findViewById<ImageView>(R.id.planflex).startAnimation(planflexAnimation)
        findViewById<TextView>(R.id.youLife).startAnimation(textFade)

        // Create a handler to delay the launch of the next activity
        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your next activity
            val intent = Intent(this@MainActivity, onBoardScreen1::class.java)
            startActivity(intent)

            // Close this activity
            finish()
        }, SPLASH_TIMEOUT)
    }
}
