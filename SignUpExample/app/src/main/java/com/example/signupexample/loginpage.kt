package com.example.signupexample

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.signupexample.databinding.ActivityLoginpageBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class loginpage : AppCompatActivity() {
    private lateinit var binding: ActivityLoginpageBinding
    private lateinit var database : DatabaseReference
    companion object{
        const val KEY1="com.example.signupexample.name"
        const val KEY2="com.example.signupexample.mail"
        const val KEY3="com.example.signupexample.uniqueId"
        const val KEY4="com.example.signupexample.passkey"
        const val KEY5="com.example.signupexample.data"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginpageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var flag=0
        binding.btn.setOnClickListener {
            flag=0
            val uniqueId =binding.uniqueId.text.toString()
            val passkey=binding.passkey.text.toString()
            if(uniqueId==""||passkey=="")
            {
                flag=1
                Toast.makeText(this,"Fill up The Fields Correctly",Toast.LENGTH_SHORT).show()

            }
            if(flag==0)
            {
                if(uniqueId.isNotEmpty())
                readdata(uniqueId,passkey)

            }
        }
    }


    private fun readdata(uniqueId: String, passkey:String) {
        database=FirebaseDatabase.getInstance().getReference("users")
        database.child(uniqueId).get().addOnSuccessListener {
            if(it.exists())
            {
                val passkeyObtained=it.child("passkey").value.toString()
                val name =it.child("name").value.toString()
                val data=it.child("data").value.toString()
                val mail=it.child("mail").value.toString()
                if(passkey==passkeyObtained)
                {
                 intent= Intent(this,Showdata::class.java)
                    intent.putExtra(KEY1,name)
                    intent.putExtra(KEY2,mail)
                    intent.putExtra(KEY3,uniqueId)
                    intent.putExtra(KEY4,passkey)
                    intent.putExtra(KEY5,data)

                startActivity(intent)
                }
                else Toast.makeText(this,"Passkey is not correct",Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this,"Unique Id does Not exist",Toast.LENGTH_SHORT).show()
        }.addOnFailureListener{
            Toast.makeText(this,"There is a problem on our side",Toast.LENGTH_SHORT).show()
        }
    }
}