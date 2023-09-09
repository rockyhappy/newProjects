package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.bmi.databinding.ActivityUnfitBinding

class unfit : AppCompatActivity() {
        private lateinit var binding: ActivityUnfitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUnfitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bmi=intent.getDoubleExtra(MainActivity.KEY ,0.0)
        binding.tv1.text="YOU ARE NOT FIT AND THE BODY MASS INDEX IS : "+bmi.toString()
    }
}