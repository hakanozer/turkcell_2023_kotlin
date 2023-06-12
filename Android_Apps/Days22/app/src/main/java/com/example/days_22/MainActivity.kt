package com.example.days_22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tinkEncDec = TinkEncDec()
        val cipherText = tinkEncDec.encrypt("123456789")
        Log.d("cipherText", cipherText)
    }
}