package com.example.workout_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.workout_app.databinding.AddWorkoutBinding

class AddWorkout : AppCompatActivity() {
    private lateinit var binding: AddWorkoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AddWorkoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}