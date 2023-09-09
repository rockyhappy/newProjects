package com.example.listviewandadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.listviewandadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val taskList=arrayListOf<String>()
        taskList.add("Do Leetcode Questions")
        taskList.add("practice on codeforces")
        taskList.add("Try Android Development")
        taskList.add("practice HTML")
        taskList.add("Practice CSS")

        val myAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        binding.lv1.adapter=myAdapter
        binding.lv1.setOnItemClickListener { adapterView, view, i, l ->
            val text="the clicked item is:"+(view as TextView).text.toString() + i.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }



    }
}