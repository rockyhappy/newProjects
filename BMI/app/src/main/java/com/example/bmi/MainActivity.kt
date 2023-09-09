package com.example.bmi

import android.content.Intent
import com.example.bmi.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object
    {
        const val KEY="com.example.bmi.Key"
    }
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener{
            var weight:Double=0.0
            var height:Double=0.0
            var flag=0
            try{
             weight =binding.Weight.text.toString().toDouble() }
        catch(e: NumberFormatException)
        {
            flag=1
            Toast.makeText(applicationContext,"Fill only integers", Toast.LENGTH_SHORT).show()
        }
            try{
            height=binding.Height.text.toString().toDouble()

            }
            catch(e: NumberFormatException){
                flag=1
                Toast.makeText(applicationContext,"Fill only integers", Toast.LENGTH_SHORT).show()
            }
        if(flag==0) {
            val bmi = (weight / (height * height)) * 10000
            intent = if (bmi in 18.5..24.9) Intent(this, fit::class.java)
            else Intent(this, unfit::class.java)
            intent.putExtra(KEY, bmi)
            startActivity(intent)
        }
        }
    }
}