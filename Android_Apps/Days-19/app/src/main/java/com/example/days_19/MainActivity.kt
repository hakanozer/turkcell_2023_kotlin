package com.example.days_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.days_19.models.Note
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.messaging.FirebaseMessaging
import java.util.Random
import java.util.UUID

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        FirebaseMessaging.getInstance().subscribeToTopic("all")
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.e("TAG", "onCreate: subscribeToTopic", )
                }else{
                    Log.e("TAG", "onCreate: subscribeToTopic failed", )
                }
            }
         */

        // Firebase RealTime Database Using
        val db = FirebaseDatabase.getInstance().getReference("notes")
        val fid = db.push().key
        val number = Random().nextInt(99) + 1
        val dt = Note("Toplantı - $number" , "Detay Toplantı")
        // db.child(UUID.randomUUID().toString()).setValue(dt)
        db.child(fid!!).setValue(dt).addOnCompleteListener {
            Toast.makeText(this,"Save Success", Toast.LENGTH_LONG).show()
        }.addOnFailureListener {
            Toast.makeText(this,it.toString(), Toast.LENGTH_LONG).show()
        }

    }
}