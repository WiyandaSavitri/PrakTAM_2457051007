package com.example.praktam_2457051007.model

import androidx.annotation.DrawableRes

data class FocusSession(
    val title: String,
    val hari: String,
    val durasi: Int,
    val status: String,
    val note: String,
    @DrawableRes val imageRes: Int
)