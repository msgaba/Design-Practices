package com.example.loginrevampproject.screens

import android.os.Bundle
import android.view.View
import androidx.viewbinding.ViewBinding
import com.example.loginrevampproject.wrapper.BaseFragment
import com.example.loginrevampproject.databinding.FragmetOtpAuthenticationBinding

class OtpAuthenticationFragment : BaseFragment() {

    private lateinit var binding: FragmetOtpAuthenticationBinding

    override fun bindView(): ViewBinding = FragmetOtpAuthenticationBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = viewBinding as FragmetOtpAuthenticationBinding
    }
}