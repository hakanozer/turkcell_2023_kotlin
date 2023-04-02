package com.example.days_1_2

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.days_1_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var btnGotoSettings: Button
    lateinit var txtData: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGotoSettings = findViewById(R.id.btnGotoSettings)
        txtData = findViewById(R.id.txtData)

        btnGotoSettings.setOnClickListener {
            var data = txtData.text.toString()
            Toast.makeText(this, data, Toast.LENGTH_LONG).show()
        }
    }



}