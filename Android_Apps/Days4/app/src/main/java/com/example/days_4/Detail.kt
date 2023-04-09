package com.example.days_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //actionBar?.setDisplayHomeAsUpEnabled(true)

        var data = intent.getStringExtra("data")
        Toast.makeText(this, data, Toast.LENGTH_LONG).show()

    }
}