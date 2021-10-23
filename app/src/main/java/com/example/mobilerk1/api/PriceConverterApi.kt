package com.example.mobilerk1.api

import android.content.SharedPreferences
import android.util.Log
import androidx.preference.PreferenceManager
import com.example.mobilerk1.api.dtos.HisToDayResponse
import java.lang.Exception
import java.util.*

object PriceConverterApi {
    val priceConverterService: PriceConverterApiService by lazy {
        retrofit.create(PriceConverterApiService::class.java)
    }

    suspend fun getHistoryToDay(from: String, to: String, limit: Int): HisToDayResponse {
        return priceConverterService.getHisToDay(from, to, limit);
//        return priceConverterService.getHisToday();
    }
}