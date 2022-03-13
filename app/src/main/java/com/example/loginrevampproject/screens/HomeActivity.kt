package com.example.loginrevampproject.screens

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginrevampproject.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickListenerSetup()
    }

    private fun clickListenerSetup() {
        binding.buttonGetStarted.setOnClickListener {
            val intent = Intent(this, OtpActivity::class.java)
            startActivity(intent)
        }
    }

}