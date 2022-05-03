package com.example.loginrevampproject.screens

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.example.loginrevampproject.R
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
            val pair1 = Pair.create(binding.imageTick as View, getString(R.string.image_logo_transition))
            val pair2 = Pair.create(binding.coverImage as View?, getString(R.string.transition))
            val activityOptionsCompat: ActivityOptionsCompat =
                ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair1, pair2)
            startActivity(intent, activityOptionsCompat.toBundle())
        }
    }

}