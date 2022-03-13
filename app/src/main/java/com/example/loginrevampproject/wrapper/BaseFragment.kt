package com.example.loginrevampproject.wrapper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * Created by Ankita
 */
abstract class BaseFragment: Fragment() {

    lateinit var viewBinding: ViewBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = bindView()
        return viewBinding.root
    }

    abstract fun bindView() : ViewBinding
}