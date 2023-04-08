package com.example.days_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlin.math.log

class Profile : AppCompatActivity() {

    lateinit var txtProfileName: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        txtProfileName = findViewById(R.id.txtProfileName)

        var name = intent.getStringExtra("name")
        var id = intent.getIntExtra("id", 0)

        if ( name != null ) {
            Log.d("name", name)
            Log.d("id", id.toString())
        }

        txtProfileName.text = MainActivity.user.name
        Log.d("user", MainActivity.user.toString())


    }
}