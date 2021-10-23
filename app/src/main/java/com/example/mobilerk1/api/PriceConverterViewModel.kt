package com.example.mobilerk1.api

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mobilerk1.api.dtos.DataElement
import kotlinx.coroutines.launch
import kotlin.random.Random

class PriceConverterViewModel : ViewModel() {
    private val dataElements = MutableLiveData<List<DataElement>?>()

    fun updateDataElements(from: String, to: String, limit: Int) {
        viewModelScope.launch {
            try {
                val response = PriceConverterApi.getHistoryToDay(from, to, limit);

                if (response.data == null) {
                    throw Exception(response.message)
                }

                dataElements.value = response.data.data
            } catch (e: Exception) {
                Log.e(PriceConverterViewModel::class.simpleName, e.toString())
                dataElements.value = null
            }
        }
    }

    fun getDataElements(): LiveData<List<DataElement>?> {
        return dataElements;
    }
}