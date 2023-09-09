package com.example.signupexample

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.signupexample.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            var name: String=""
            var mail :String =""
            var uniqueId:String =""
            var passkey: String =""
            var flag=0;
            try {
                 name =binding.name.text.toString()
                 mail=binding.mail.text.toString()
                 uniqueId=binding.uniqueId.text.toString()
                passkey=binding.passkey.text.toString()
                if(name=="" || mail==""||uniqueId==""||passkey=="")
                    flag=1
            }
            catch (e: Exception)
            {
                flag=1;
                Toast.makeText(this,"Fill correctly",Toast.LENGTH_SHORT).show()
            }
            if(flag==0)
            {

                database=FirebaseDatabase.getInstance().getReference("users")

                database.child(uniqueId).get().addOnSuccessListener {

                    if(it.exists())
                    Toast.makeText(this,"Unique Id is unavailable",Toast.LENGTH_SHORT).show()

                    else
                    {
                        var data=""
                        val user=users(name,mail,uniqueId,passkey,data)
                        database.child(uniqueId).setValue(user).addOnSuccessListener {
                            binding.name.text?.clear()
                            binding.mail.text?.clear()
                            binding.uniqueId.text?.clear()
                            binding.passkey.text?.clear()
                            Toast.makeText(this, "User Registered",Toast.LENGTH_SHORT).show()
                        }.addOnFailureListener {
                            Toast.makeText(this, "Failed",Toast.LENGTH_SHORT).show()
                        }
                    }

                }.addOnFailureListener {

                        Toast.makeText(this, "Failed",Toast.LENGTH_SHORT).show()

                }
            }
            if(flag==1)
                Toast.makeText(this,"Fill correctly",Toast.LENGTH_SHORT).show()
        }
        binding.tv.setOnClickListener {
                    binding.tv.setTextColor(Color.BLUE)
            Handler(Looper.getMainLooper()).postDelayed(
                {
                    binding.tv.setTextColor(Color.WHITE)
                    intent = Intent(this,loginpage::class.java)
                    startActivity(intent)
                },100
            )

            }
    }
}