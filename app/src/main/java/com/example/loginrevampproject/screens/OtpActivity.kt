package com.example.loginrevampproject.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.example.loginrevampproject.R
import com.example.loginrevampproject.databinding.ActivityOtpBinding
import com.example.loginrevampproject.wrapper.tint

const val _ENTER = 1
const val _VALIDATE = 2
const val _AUTHENTICATE = 3

class OtpActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOtpBinding

    var currentScreen: Int = 0
    var showPhn: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ActivityOptionsCompat.makeSceneTransitionAnimation(
            this,
            Pair.create(binding.imageTick1, getString(R.string.image_logo_transition)),
            Pair.create(binding.coverImage, getString(R.string.transition))
        )
        clickListenerSetup()
        enterOtpFragmentSetup()
    }

    private fun setToolbarTitle(title: String) {
        binding.toolbarTitle.text = title
    }

    private fun enterOtpFragmentSetup() {
        currentScreen = _ENTER
        setToolbarTitle(getString(R.string.login))
        val fragment = EnterOtpFragment()
        supportFragmentManager.beginTransaction()
            .add(binding.frame.id, fragment, EnterOtpFragment::class.java.name)
            .commit()
    }

    fun otpValidateFragmentSetup() {
        currentScreen = _VALIDATE
        setToolbarTitle(getString(R.string.enter_otp))
        binding.imageTick2.tint(this, R.color.green)
        val fragment = OtpValidationFragment()
        supportFragmentManager.beginTransaction()
            .add(binding.frame.id, fragment, OtpValidationFragment::class.java.name)
            .addToBackStack(OtpValidationFragment::class.java.name)
            .commit()
    }

    fun otpAuthenticationFragmentSetup() {
        currentScreen = _AUTHENTICATE
        setToolbarTitle(getString(R.string.otp_verified))
        binding.imageTick3.tint(this, R.color.green)
        val fragment = OtpAuthenticationFragment()
        supportFragmentManager.beginTransaction()
            .add(binding.frame.id, fragment, OtpAuthenticationFragment::class.java.name)
            .addToBackStack(OtpAuthenticationFragment::class.java.name)
            .commit()
    }

    private fun clickListenerSetup() {
        binding.backButton.setOnClickListener {
            when (currentScreen) {
                _ENTER -> {
                    finish()
                }
                _VALIDATE -> {
                    supportFragmentManager.popBackStack()
                    setToolbarTitle(getString(R.string.login))
                    binding.imageTick2.tint(this, R.color.lightest_grey)
                    currentScreen = _ENTER
                }
                _AUTHENTICATE -> {
                    supportFragmentManager.popBackStack()
                    setToolbarTitle(getString(R.string.enter_otp))
                    binding.imageTick3.tint(this, R.color.lightest_grey)
                    currentScreen = _VALIDATE
                }
                else -> finish()
            }
        }
    }
}