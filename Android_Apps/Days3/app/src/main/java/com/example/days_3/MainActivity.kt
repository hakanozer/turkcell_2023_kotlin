package com.example.days_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object {
        var user = UserData("","","", 0)
    }

    lateinit var btnGotoProfile: Button
    lateinit var txtName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGotoProfile = findViewById(R.id.btnGotoProfile)
        txtName = findViewById(R.id.txtName)
        btnGotoProfile.setOnClickListener {
            var intent = Intent(this, Profile::class.java)
            intent.putExtra("name", "Erkan Bilsin")
            intent.putExtra("id", 100)

            user = UserData(txtName.text.toString(), "Bilsin", "serkan@mail.com", 150)
            startActivity(intent)
            // finish() mevcut sınıfı öldür
        }
    }
}