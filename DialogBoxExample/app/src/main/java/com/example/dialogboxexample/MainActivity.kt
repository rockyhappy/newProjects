package com.example.dialogboxexample

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dialogboxexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ty1.setOnClickListener {
            val builder1=AlertDialog.Builder(this)
            builder1.setTitle("Are you Sure")
            builder1.setMessage("Do you want to close the app")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                //what action should be performed when yes is clicked
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                //what should be perfomed when no is clicked
            })
                builder1.show()
        }
        binding.ty2.setOnClickListener {
            val order = arrayOf("Male","Female","TransGender","foolish")
            val builder2=AlertDialog.Builder(this)
            builder2.setTitle("Select your gender")
            builder2.setSingleChoiceItems(order,0,DialogInterface.OnClickListener { dialogInterface, which ->
                Toast.makeText(this,"you chose ${order[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder2.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                //what should be perfomed when no is clicked
            })
            builder2.show()
        }
        binding.ty3.setOnClickListener {
            val order = arrayOf("Male","Female","TransGender","foolish")
            val builder3=AlertDialog.Builder(this)
            builder3.setTitle("Select your gender")
            builder3.setMultiChoiceItems(order,null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, which, b ->
                Toast.makeText(this,"you chose ${order[which]}",Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder3.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                //what should be perfomed when no is clicked
            })
            builder3.show()
        }
    }
}