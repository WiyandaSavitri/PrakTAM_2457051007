package com.example.praktam_2457051007.model

import com.example.praktam_2457051007.R

object FocusSessionSource {
    val sessions = listOf(
        FocusSession(
            title = "Morning Focus",
            hari = "Senin",
            durasi = 25,
            status = "Fokus",
            note = "Belajar Kotlin Compose dasar",
            imageRes = R.drawable.focus
        ),
        FocusSession(
            title = "Short Break",
            hari = "Senin",
            durasi = 5,
            status = "Istirahat",
            note = "Minum air dan peregangan ringan",
            imageRes = R.drawable.break_time
        ),
        FocusSession(
            title = "Deep Work",
            hari = "Selasa",
            durasi = 25,
            status = "Fokus",
            note = "Mengerjakan layout UI aplikasi",
            imageRes = R.drawable.pomodoro
        ),
        FocusSession(
            title = "Recharge Break",
            hari = "Selasa",
            durasi = 5,
            status = "Istirahat",
            note = "Istirahat singkat sebelum lanjut",
            imageRes = R.drawable.break_time
        ),
        FocusSession(
            title = "Evening Study",
            hari = "Rabu",
            durasi = 25,
            status = "Fokus",
            note = "Review materi TAM",
            imageRes = R.drawable.focus
        )
    )
}