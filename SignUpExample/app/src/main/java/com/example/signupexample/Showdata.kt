package com.example.signupexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import com.example.signupexample.databinding.ActivityShowdataBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Showdata : AppCompatActivity() {
    private lateinit var binding: ActivityShowdataBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowdataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(loginpage.KEY1).toString()
        val mail = intent.getStringExtra(loginpage.KEY2).toString()
        val uniqueId = intent.getStringExtra(loginpage.KEY3).toString()
        val passkey = intent.getStringExtra(loginpage.KEY4).toString()
        val data = intent.getStringExtra(loginpage.KEY5)
        binding.tv.text= "Name : $name \nMail : $mail\nUnique Id : $uniqueId\nPassKey : $passkey"
        binding.et.setText(data)
        binding.btn.setOnClickListener {
            var new:String =binding.et.text.toString()
            val user=users(name,mail,uniqueId,passkey,new)
            database=FirebaseDatabase.getInstance().getReference("users")
            database.child(uniqueId).setValue(user).addOnSuccessListener {
            Toast.makeText(this,"Value Updated : $new",Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this,"Failed to Update",Toast.LENGTH_SHORT).show()
            }
        }
    }
}