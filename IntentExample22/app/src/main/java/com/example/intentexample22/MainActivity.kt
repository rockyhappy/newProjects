package com.example.intentexample22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.intentexample22.databinding.ActivityMainBinding
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var pic1=R.drawable.pic1
    var pic2=R.drawable.pic2
    var pic3=R.drawable.pic3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rands=(1..6).random()
        val im=R.drawable.door1
        binding.btn1.setFactory {
                val imageView = ImageView(this)
                imageView.scaleType = ImageView.ScaleType.FIT_CENTER
                imageView.layoutParams = FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT,
                    FrameLayout.LayoutParams.MATCH_PARENT
                )
                imageView
            }
        binding.btn2.setFactory {
            val imageView = ImageView(this)
            imageView.scaleType = ImageView.ScaleType.FIT_CENTER
            imageView.layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            imageView
        }
        binding.btn3.setFactory {
            val imageView = ImageView(this)
            imageView.scaleType = ImageView.ScaleType.FIT_CENTER
            imageView.layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            imageView
        }
        binding.btn1.setImageResource(im)
        binding.btn2.setImageResource(im)
        binding.btn3.setImageResource(im)

        when(rands)
        {
            1->
            {
                 pic1=R.drawable.pic1
                 pic2=R.drawable.pic2
                 pic3=R.drawable.pic3
            }
            2->
            {
                 pic1=R.drawable.pic2
                 pic2=R.drawable.pic3
                 pic3=R.drawable.pic1
            }
            3->
            {
                 pic1=R.drawable.pic3
                 pic2=R.drawable.pic1
                 pic3=R.drawable.pic2
            }
            4->
            {
                 pic1=R.drawable.pic1
                 pic2=R.drawable.pic3
                 pic3=R.drawable.pic2
            }
            5->
            {
                 pic1=R.drawable.pic3
                 pic2=R.drawable.pic2
                 pic3=R.drawable.pic1
            }
            6->
            {
                 pic1=R.drawable.pic2
                 pic2=R.drawable.pic1
                 pic3=R.drawable.pic3
            }

        }
        binding.btn1.setOnClickListener {
            Toast.makeText(this,"Died",Toast.LENGTH_SHORT).show()
            binding.btn1.setImageResource(pic1)
        }
        binding.btn2.setOnClickListener {
            Toast.makeText(this,"Died",Toast.LENGTH_SHORT).show()
            binding.btn2.setImageResource(pic2)
        }
        binding.btn3.setOnClickListener {
            Toast.makeText(this,"Died",Toast.LENGTH_SHORT).show()
            binding.btn3.setImageResource(pic3)
        }
        binding.btn4.setOnClickListener {
            binding.btn1.setImageResource(im)
            binding.btn2.setImageResource(im)
            binding.btn3.setImageResource(im)
            restart()
        }
    }
    fun restart()
    {
        val rands=(1..6).random()
        when(rands)
        {
            1->
            {
                pic1=R.drawable.pic1
                pic2=R.drawable.pic2
                pic3=R.drawable.pic3
            }
            2->
            {
                pic1=R.drawable.pic2
                pic2=R.drawable.pic3
                pic3=R.drawable.pic1
            }
            3->
            {
                pic1=R.drawable.pic3
                pic2=R.drawable.pic1
                pic3=R.drawable.pic2
            }
            4->
            {
                pic1=R.drawable.pic1
                pic2=R.drawable.pic3
                pic3=R.drawable.pic2
            }
            5->
            {
                pic1=R.drawable.pic3
                pic2=R.drawable.pic2
                pic3=R.drawable.pic1
            }
            6->
            {
                pic1=R.drawable.pic2
                pic2=R.drawable.pic1
                pic3=R.drawable.pic3
            }

        }
    }
}