package com.example.days_15

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {

    lateinit var btnCreateNotification: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateNotification = findViewById(R.id.btnCreateNotification)
        btnCreateNotification.setOnClickListener {
            createNotify("New Title", "New Desc")
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotify(title: String, detail: String) {
        val notification = NotificationCompat
            .Builder(this@MainActivity, "userChannel" )
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle(title)
            .setContentText(detail)
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        val intent = Intent(this, Detail::class.java )
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.putExtra("id", 100)

        val pending = PendingIntent.getActivity(this, 0,intent, PendingIntent.FLAG_UPDATE_CURRENT)
        notification.setContentIntent(pending)

        val channel = NotificationChannel( "userChannel","User Channel",NotificationManager.IMPORTANCE_DEFAULT)
        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.createNotificationChannel(channel)
        manager.notify(10000, notification.build())

    }

}