package com.example.praktam_2457051007.network

import com.example.praktam_2457051007.model.FocusSession
import retrofit2.http.GET

interface ApiService {
    @GET("focus_session.json")
    suspend fun getFocusSessions(): List<FocusSession>
}