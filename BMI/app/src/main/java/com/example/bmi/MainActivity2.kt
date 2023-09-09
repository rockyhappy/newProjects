package com.example.bmi
import android.graphics.drawable.GradientDrawable
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()


        val colors = intArrayOf(
            0xFFE5007D.toInt(),
            0xFFEA2C88.toInt(),// Color 1: Red
            0xFFAB3E8F.toInt(),
            0xFF874996.toInt(),// Color 2: Purple
            0xFF5E4E9C.toInt(),

            )

        val positions = floatArrayOf(0.0f, 0.25f, 0.5f, 0.75f, 1.0f)

        val gradientDrawable = GradientDrawable(
            GradientDrawable.Orientation.LEFT_RIGHT, colors
        )

        gradientDrawable.gradientType = GradientDrawable.LINEAR_GRADIENT
        gradientDrawable.colors = colors
        gradientDrawable.gradientRadius = 0f

        val linearLayout = findViewById<LinearLayout>(R.id.ly1)
        linearLayout.background = gradientDrawable
        val imageView = findViewById<ImageView>(R.id.im1)
        imageView.background = gradientDrawable

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            },4000
        )
    }
}