package com.example.days_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    companion object {
        var user = UserData("","","", 0)
    }

    lateinit var btnGotoProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGotoProfile = findViewById(R.id.btnGotoProfile)
        btnGotoProfile.setOnClickListener {
            var intent = Intent(this, Profile::class.java)
            intent.putExtra("name", "Erkan Bilsin")
            intent.putExtra("id", 100)

            user = UserData("Serkan", "Bilsin", "serkan@mail.com", 150)
            startActivity(intent)
            // finish() mevcut sınıfı öldür
        }
    }
}