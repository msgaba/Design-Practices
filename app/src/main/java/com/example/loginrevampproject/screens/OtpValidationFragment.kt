package com.example.loginrevampproject.screens

import android.os.Bundle
import android.view.View
import androidx.viewbinding.ViewBinding
import com.example.loginrevampproject.R
import com.example.loginrevampproject.databinding.FragmentOtpValidationBinding
import com.example.loginrevampproject.wrapper.BaseFragment

class OtpValidationFragment : BaseFragment() {

    private lateinit var binding: FragmentOtpValidationBinding

    override fun bindView(): ViewBinding = FragmentOtpValidationBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = viewBinding as FragmentOtpValidationBinding
        viewSetup((activity as OtpActivity).showPhn)
        clickListenerSetup()
    }

    private fun viewSetup(showPhn: Boolean) {
        binding.apply {
            subTitle.text =
                getString(if (showPhn) R.string.verification_msg_mobile else R.string.verification_msg_email)
            phone.text = getString(if (showPhn) R.string.phone_hint else R.string.email_hint)
        }
    }

    private fun clickListenerSetup() {
        binding.buttonSubmitOtp.setOnClickListener {
            (activity as OtpActivity).otpAuthenticationFragmentSetup()
        }
    }
}