package com.example.mobilerk1.api

import com.example.mobilerk1.api.dtos.HisToDayResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface PriceConverterApiService {
        @GET("histoday")
    suspend fun getHisToDay(
            @Query("fsym") fsym: String,
            @Query("tsym") tsym: String,
            @Query("limit") limit: Int
    ): HisToDayResponse
//    @GET("histoday?fsym=BTC&tsym=USD&limit=10")
//    @Headers("authorization: Apikey 3c645eeb6b20a466fe8c52cf7b576c6c77a1357df23522730ee0f8d5e112fa4b")
//    suspend fun getHisToday(): HisToDayResponse
}
