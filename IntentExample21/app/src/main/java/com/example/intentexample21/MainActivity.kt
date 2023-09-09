package com.example.intentexample21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rnds=(1..3).random()
        val btn1=findViewById<ImageButton>(R.id.btn1)
        val btn2=findViewById<ImageButton>(R.id.btn2)
        val btn3=findViewById<ImageButton>(R.id.btn3)
        val btn4 =findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener{
            rnds=(1..3).random()
        }
        btn1.setOnClickListener {
            when(rnds) {
                1 -> intent = Intent(applicationContext, MainActivity2::class.java)
                2 -> intent = Intent(applicationContext, MainActivity3::class.java)
                3 -> intent = Intent(applicationContext, MainActivity4::class.java)
            }
            startActivity(intent)
        }
        btn2.setOnClickListener {
            when(rnds) {
                1 -> intent = Intent(applicationContext, MainActivity4::class.java)
                2 -> intent = Intent(applicationContext, MainActivity2::class.java)
                3 -> intent = Intent(applicationContext, MainActivity3::class.java)
            }
            startActivity(intent)
        }
        btn3.setOnClickListener {
            when(rnds) {
                1 -> intent = Intent(applicationContext, MainActivity3::class.java)
                2 -> intent = Intent(applicationContext, MainActivity4::class.java)
                3 -> intent = Intent(applicationContext, MainActivity2::class.java)
            }
            startActivity(intent)
        }
    }
}