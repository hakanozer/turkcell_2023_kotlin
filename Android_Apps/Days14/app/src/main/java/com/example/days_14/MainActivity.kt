package com.example.days_14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.util.Timer
import java.util.TimerTask
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    lateinit var btnGotoProfile: Button
    lateinit var txtData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.d("lifecycle", "onCreate - 1")
        btnGotoProfile = findViewById(R.id.btnGotoProfile)
        txtData = findViewById(R.id.txtData)


        val timer = Timer()
        timer.schedule(task, 0, 1000)

        btnGotoProfile.setOnClickListener {
            val i = Intent(this, Profile::class.java)
            startActivity(i)
            // finish()
        }
    }

    var i = 0
    val task = object : TimerTask() {
        override fun run() {
            runOnUiThread {
                i++
                txtData.setText("$i")
            }

        }
    }

    override fun onStart() {
        super.onStart()
        // UI(Button, Resim, ListView...) bölümün kullanılmaya hazır olması
        Log.d("lifecycle", "onStart - 2")
    }

    override fun onResume() {
        super.onResume()
        // Uygulamanın tekrar aktif olmasını yakalar
        Log.d("lifecycle", "onResume - 3")
    }

    override fun onPause() {
        super.onPause()
        // Arka plana alınma aşamasında yada yeni bir activity açıldığında(Finish yapılmadan)
        Log.d("lifecycle", "onPause - 4")
    }

    override fun onStop() {
        super.onStop()
        // activity arkaplana alındığında yada finish ile terkedildiğinde
        Log.d("lifecycle", "onStop - 5")
    }

    override fun onDestroy() {
        super.onDestroy()
        try {
            //Thread.sleep(10000)
            //TimeUnit.MILLISECONDS.sleep(10000)
        }catch (ex: Exception) {

        }
        // Activity artık arka planda kapatıldı.
        Log.d("lifecycle", "onDestroy - 6")
    }


}