package com.example.days_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.days_19.models.Note
import com.example.days_19.models.NoteVal
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.util.Random

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
        //for ( i in 0..5 ) {
            val fid = db.push().key
            val number = Random().nextInt(99) + 1
            val dt = NoteVal("Toplantı - $number", "Detay Toplantı")
            // db.child(UUID.randomUUID().toString()).setValue(dt)
            db.child(fid!!).setValue(dt).addOnCompleteListener {
                Toast.makeText(this, "Save Success", Toast.LENGTH_LONG).show()
            }.addOnFailureListener {
                Toast.makeText(this, it.toString(), Toast.LENGTH_LONG).show()
            }
        //}

        // data list
        db.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if ( snapshot.exists() ) {
                    snapshot.children.forEach {
                        val noteVal = it.getValue(NoteVal::class.java)
                        val note = Note(it.key!!, noteVal!!)
                        Log.d("note", note.toString())
                    }
                }
            }
            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(applicationContext, error.toString(), Toast.LENGTH_LONG).show()
            }
        })

        Log.d("ayrac", "=================================================")
        db.child("-NWx2mTu3VhVdViC7C-i").addValueEventListener( object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if ( snapshot.exists() ) {
                    Log.d("childNote", snapshot.value.toString())
                }
            }
            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(applicationContext, error.toString(), Toast.LENGTH_LONG).show()
            }
        })
        Log.d("ayrac", "=================================================")
        db.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if ( snapshot.exists() ) {
                    snapshot.children.forEach{
                        Log.d("Single", it.toString())
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                //TODO("Not yet implemented")
            }

        })

    }
}