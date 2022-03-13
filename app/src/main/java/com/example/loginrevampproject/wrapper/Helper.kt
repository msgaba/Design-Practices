package com.example.loginrevampproject.wrapper

import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE

/**
 * Created by Ankita
 */

fun View.hide() {
    visibility = GONE
}

fun View.show() {
    visibility = VISIBLE
}