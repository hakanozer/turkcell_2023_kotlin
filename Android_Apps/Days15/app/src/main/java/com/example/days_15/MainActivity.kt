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
import java.sql.Time
import java.util.Calendar
import java.util.Timer
import java.util.TimerTask
import java.util.UUID

class MainActivity : AppCompatActivity() {

    lateinit var btnCreateNotification: Button
    lateinit var timer:Timer

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateNotification = findViewById(R.id.btnCreateNotification)
        btnCreateNotification.setOnClickListener {
            createNotify("New Title", "New Desc")
        }

        timer = Timer()
        timer.schedule(task, 10000, 10000 )

    }

    val task = object:TimerTask() {
        @RequiresApi(Build.VERSION_CODES.O)
        override fun run() {
            createNotify(UUID.randomUUID().toString(), "New Desc")
            timer.cancel()
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

        //notification.setWhen(Calendar.getInstance().timeInMillis + 10000)
        //notification.setShowWhen(true)

        val intent = Intent(this, Detail::class.java )
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.putExtra("id", 100)

        val pending = PendingIntent.getActivity(this, 0,intent, PendingIntent.FLAG_UPDATE_CURRENT)
        notification.setContentIntent(pending)

        val channel = NotificationChannel( "userChannel","User Channel",NotificationManager.IMPORTANCE_DEFAULT)
        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.createNotificationChannel(channel)

        val id = System.currentTimeMillis() + 10000
        manager.notify(id.toInt(), notification.build())

    }

}