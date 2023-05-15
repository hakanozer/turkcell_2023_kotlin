package com.example.days_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getIntExtra("id", 0)
        Log.d("id", id.toString())
    }
}