package com.example.days_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object {
        var user = UserData("","","", 0)
    }

    lateinit var btnGotoProfile: Button
    lateinit var txtName: EditText
    lateinit var txtId: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGotoProfile = findViewById(R.id.btnGotoProfile)
        txtName = findViewById(R.id.txtName)
        txtId = findViewById(R.id.txtId)

        btnGotoProfile.setOnClickListener {
            var stName = txtName.text.toString()
            var stId = txtId.text.toString()
            if ( stName.isNotEmpty() && stId.isNotEmpty()) {

                var intent = Intent(this, Profile::class.java)
                intent.putExtra("name", "Erkan Bilsin")
                intent.putExtra("id", 100)

                var id: Int = stId.toInt()
                user = UserData(stName, "Bilsin", "serkan@mail.com", id)
                startActivity(intent)
                // finish() mevcut sınıfı öldür
            }else {
                Toast.makeText(this, "Input's Empty!", Toast.LENGTH_LONG).show()
            }
        }
    }
}