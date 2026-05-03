package com.example.praktam_2457051007.model

import com.google.gson.annotations.SerializedName

data class FocusSession(
    val title: String,
    val hari: String,
    val durasi: Int,
    val status: String,
    val note: String,

    @SerializedName("image_url")
    val imageUrl: String
)