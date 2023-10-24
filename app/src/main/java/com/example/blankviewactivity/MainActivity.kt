package com.example.blankviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.blankviewactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {//made by P1su
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}