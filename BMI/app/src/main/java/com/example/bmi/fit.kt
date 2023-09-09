package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bmi.databinding.ActivityFitBinding


class fit : AppCompatActivity() {
    private lateinit var binding: ActivityFitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFitBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bmi=intent.getDoubleExtra(MainActivity.KEY ,0.0)
        binding.tv1.text= "YOU ARE FIT AND YOUR BMI IS : $bmi"
    }
}