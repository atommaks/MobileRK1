package com.example.mobilerk1

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import java.lang.Exception

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
        val sharedPref : SharedPreferences = preferenceManager.sharedPreferences
        try {
            val cur = sharedPref.getString("list_preference_1", "BTC")
            val limit = sharedPref.getString("edit_text_preference_2", "10")?.toInt()
            Log.i("Settings", "Cur: $cur DateLimit: $limit")
        } catch (e: Exception) {
            Log.e("Settings", e.toString())
        }
    }


}