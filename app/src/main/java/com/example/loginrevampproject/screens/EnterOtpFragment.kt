package com.example.loginrevampproject.screens

import android.os.Bundle
import android.view.View
import androidx.viewbinding.ViewBinding
import com.example.loginrevampproject.R
import com.example.loginrevampproject.databinding.FragmentEnterOtpBinding
import com.example.loginrevampproject.wrapper.BaseFragment
import com.example.loginrevampproject.wrapper.hide
import com.example.loginrevampproject.wrapper.show

class EnterOtpFragment : BaseFragment() {

    private lateinit var binding: FragmentEnterOtpBinding

    override fun bindView(): ViewBinding = FragmentEnterOtpBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = viewBinding as FragmentEnterOtpBinding
        clickListenerSetup()
    }

    private fun clickListenerSetup() {
        binding.buttonRequestOtp.setOnClickListener {
            (activity as OtpActivity).otpValidateFragmentSetup()
        }
        binding.emailHeader.setOnClickListener {
            viewSetup(showPhn = false)
        }
        binding.phnHeader.setOnClickListener {
            viewSetup(showPhn = true)
        }
    }

    private fun viewSetup(showPhn: Boolean) {
        (activity as OtpActivity).showPhn = showPhn
        binding.apply {
            phnHeader.background = resources.getDrawable(
                if (showPhn) R.drawable.round_corner_background else android.R.color.transparent,
                context?.theme
            )
            emailHeader.background = resources.getDrawable(
                if (showPhn) android.R.color.transparent else R.drawable.round_corner_background,
                context?.theme
            )
            tvPhnHeader.text = getString(if (showPhn) R.string.phone_number else R.string.email_id)
            phoneNoText.text = getString(if (showPhn) R.string.phone_hint else R.string.email_hint)
            if (showPhn) partition.show() else partition.hide()
            if (showPhn) phnCode.show() else phnCode.hide()
        }
    }
}