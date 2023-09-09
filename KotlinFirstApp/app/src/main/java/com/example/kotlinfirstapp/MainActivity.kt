package com.example.kotlinfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.kotlinfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonUpload=findViewById<Button>(R.id.btnUpload)
        val buttonDownload=findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener{
            Toast.makeText(applicationContext,"uploading.....",Toast.LENGTH_SHORT).show()
        }
        buttonDownload.setOnClickListener{
            Toast.makeText(applicationContext,"Downloading.....",Toast.LENGTH_SHORT).show()
        }
    }






}