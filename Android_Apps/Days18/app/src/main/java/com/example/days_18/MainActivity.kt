package com.example.days_18

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.days_18.configs.AppDatabase
import com.example.days_18.models.Note

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "appDataBase"
        ).build();

        val run = Runnable {
            val note = Note(null, "Toplantı-y", "Detay-y", 30, null);
            val status = db.noteDao().insert(note)
            Log.d("Status", status.toString())

            val ls = db.noteDao().getAll();
            for ( item in ls ) {
                Log.d("item", item.toString())
            }

        }
        Thread(run).start()
    }
}