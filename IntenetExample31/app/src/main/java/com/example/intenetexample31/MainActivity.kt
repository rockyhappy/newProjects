package com.example.intenetexample31

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val codingNinjas=findViewById<CardView>(R.id.CodingNinjas)
        codingNinjas.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.codingninjas.com/studio/profile/82b8d069-b3e3-43cf-995f-da6b15ac1332")
            startActivity(intent)
        }
        val leetcode =findViewById<CardView>(R.id.leetcode)
        leetcode.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://leetcode.com/rockyhappy/")
            startActivity(intent)
        }
        val codechef =findViewById<CardView>(R.id.codechef)
        codechef.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.codechef.com/users/rockyhappy")
            startActivity(intent)
        }
        val codeforces =findViewById<CardView>(R.id.codeforces)
        codeforces.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://codeforces.com/profile/rachitkatiyar869")
            startActivity(intent)
        }
        val gfg=findViewById<CardView>(R.id.gfg)
        gfg.setOnClickListener {
            val launchIntent =
                packageManager.getLaunchIntentForPackage("free.programming.programming")
            if (launchIntent != null) {
                startActivity(launchIntent)
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "There is no package available in android",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        val linkdin=findViewById<CardView>(R.id.linkdin)
        linkdin.setOnClickListener {
            val launchIntent =
                packageManager.getLaunchIntentForPackage("com.linkedin.android")
            if (launchIntent != null) {
                startActivity(launchIntent)
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "There is no package available in android",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        val Github=findViewById<CardView>(R.id.Github)
        Github.setOnClickListener {
            val launchIntent =
                packageManager.getLaunchIntentForPackage("com.github.android")
            if (launchIntent != null) {
                startActivity(launchIntent)
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "There is no package available in android",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}


