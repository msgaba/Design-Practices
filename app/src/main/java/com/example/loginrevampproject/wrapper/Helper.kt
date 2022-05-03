package com.example.loginrevampproject.wrapper

import android.content.Context
import android.content.res.ColorStateList
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView
import androidx.core.content.ContextCompat

fun View.hide() {
    visibility = GONE
}

fun View.show() {
    visibility = VISIBLE
}

fun ImageView.tint(context: Context, colour: Int) {
    imageTintList = ColorStateList.valueOf(
        ContextCompat.getColor(
            context,
            colour
        )
    )
}