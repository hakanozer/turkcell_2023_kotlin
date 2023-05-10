package com.example.days_13

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    lateinit var db: DB
    lateinit var btnDate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnDate = findViewById(R.id.btnDate)
        val calender = Calendar.getInstance()
        btnDate.setOnClickListener(View.OnClickListener {
            val datePickerDialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->
                    Log.d("i", i.toString()) // yıl
                    Log.d("i2", i2.toString()) // ay
                    Log.d("i3", i3.toString()) // gün
                },
                calender.get(Calendar.YEAR),
                calender.get(Calendar.MONTH),
                calender.get(Calendar.DAY_OF_MONTH),
            )
            datePickerDialog.show()
        })

        db = DB(this)
        var status = db.addNote("Tarih Notu", "Tarih Detay", "10.05.2023")
        Log.d("status", status.toString())

    }
}