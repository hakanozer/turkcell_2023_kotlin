package com.example.days_19


import android.util.Log
import android.widget.Toast
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyFirebaseInstanceIDService : FirebaseMessagingService(){

    override fun onNewToken(token: String) {
        Log.d("Token", "Refreshed token: $token")
    }

    override fun onMessageReceived(message: RemoteMessage) {

        Log.d("aafrom", "Call")
        Log.d("aafrom", "${message.from}")
        Log.d("aafrom", "${message.messageId}")
        if ( message.data.isNotEmpty() ) {
            Toast.makeText(applicationContext, "", Toast.LENGTH_LONG).show()
            Log.d("aafrom", "${message.data}")
        }
        message.notification?.let {
            Log.d("aafrom", "${it.body}")
        }
    }



}