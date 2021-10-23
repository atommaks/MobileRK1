package com.example.mobilerk1.api.dtos

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize


data class HisToDayResponse(
    @Json(name = "Response") val response: String,
    @Json(name = "Message") val message: String,
    @Json(name = "HasWarning") val hasWarning: Boolean?,
    @Json(name = "Data") val data: HisToDayData?
)

data class HisToDayData(
    @Json(name = "Aggregated") val aggregated: Boolean,
    @Json(name = "TimeFrom") val timeFrom: Long,
    @Json(name = "TimeTo") val timeTo: Long,
    @Json(name = "Data") val data: List<DataElement>,
)

@Parcelize
data class DataElement(
    @Json(name = "time") val time: Long,
    @Json(name = "high") val high: Float,
    @Json(name = "low") val low: Float,
    @Json(name = "open") val open: Float,
    @Json(name = "volumefrom") val volumeFrom: Float,
    @Json(name = "volumeto") val volumeTo: Float,
    @Json(name = "close") val close: Float,
    @Json(name = "conversionType") val conversionType: String,
    @Json(name = "conversionSymbol") val conversionSymbol: String,
) : Parcelable
