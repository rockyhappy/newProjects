package com.example.codeforces

//import android.databinding.DataBindingUtil
import com.example.codeforces.databinding.ActivityMainBinding
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.parcelize.Parcelize
//import kotlinx.android.synthetic.main.activity_main.contest
//import kotlinx.android.synthetic.main.activity_main.home
//import kotlinx.android.synthetic.main.activity_main.profile

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val profile = findViewById<Button>(R.id.profile)
//        val contest = findViewById<Button>(R.id.Contest)
//        val home = findViewById<Button>(R.id.Home)
        // It is no longer required to set find view by id if you use kotlin android extentions
        binding.profile.setOnClickListener{
            intent= Intent(applicationContext,Profile::class.java)
            startActivity(intent)
        }
        binding.contest.setOnClickListener{
            intent =Intent(applicationContext,Contest::class.java)
            startActivity(intent)
        }
        binding.home.setOnClickListener {
            intent = Intent(applicationContext,Home::class.java)
            startActivity(intent)
        }
    }

}


