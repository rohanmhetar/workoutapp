package com.example.workout_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.app.DatePickerDialog
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import com.example.workout_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent
    
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.add.setOnClickListener { launchAdd() }
    }

    private fun launchAdd() {
        listIntent = Intent(this, AddWorkout::class.java)
        startActivity(listIntent)
    }
}