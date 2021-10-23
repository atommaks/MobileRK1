package com.example.mobilerk1

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.preference.PreferenceManager
import com.example.mobilerk1.api.PriceConverterViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
//        preferences.registerOnSharedPreferenceChangeListener(this)

        val navController = findNavController(R.id.frag_holder)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.btn_open_sttgs) {
//            findNavController(R.id.frag_holder).navigate(R.id.settingsFragment)
            startActivity(Intent(this, SettingsActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.frag_holder)
        return navController.navigateUp()
    }

//    override fun onSharedPreferenceChanged(preferences: SharedPreferences?, str: String?) {
//        Log.i("Changed", "Changed")
//    }
}