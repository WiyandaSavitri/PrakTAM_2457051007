package com.example.praktam_2457051007.data.repository

import com.example.praktam_2457051007.data.model.FocusSession
import com.example.praktam_2457051007.data.api.RetrofitClient

class FocusSessionRepository {

    suspend fun getFocusSessions(): List<FocusSession> {
        return try {
            RetrofitClient.apiService.getFocusSessions()
        } catch (e: Exception) {
            emptyList()
        }
    }
}