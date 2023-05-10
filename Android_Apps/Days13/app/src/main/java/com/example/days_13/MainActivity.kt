package com.example.days_13

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.days_13.models.Note
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    lateinit var db: DB
    lateinit var btnDate: Button
    lateinit var btnSave: Button
    var selectDate = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSave = findViewById(R.id.btnSave)
        btnDate = findViewById(R.id.btnDate)
        db = DB(this)
        val deleteStatus =  db.deleteNote(2)
        Log.d("deleteStatus", deleteStatus.toString())

        val updateStatus = db.updateNote("Kahvaltı", "Pazar Günü Van Kahvaltısı", 3)
        Log.d("updateStatus", updateStatus.toString())

        val calender = Calendar.getInstance()
        btnDate.setOnClickListener(View.OnClickListener {
            val datePickerDialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->
                    Log.d("i", i.toString()) // yıl
                    Log.d("i2", (i2 + 1).toString()) // ay
                    Log.d("i3", i3.toString()) // gün
                    var ay = "${i2+1}"
                    if ( i2+1 < 10 ) {
                        ay = "0${i2+1}"
                    }
                    selectDate = "$i3.$ay.$i"
                },
                calender.get(Calendar.YEAR),
                calender.get(Calendar.MONTH),
                calender.get(Calendar.DAY_OF_MONTH),
            )
            datePickerDialog.show()
        })

        btnSave.setOnClickListener {
            if ( selectDate != "" ) {
                var status = db.addNote("Tarih Notu", "Tarih Detay", selectDate)
                Log.d("status", status.toString())
                selectDate = ""
                val ls = db.allNote()
                Log.d("ls", ls.toString())
            }else {
                Toast.makeText(this, "Plase Select Date!", Toast.LENGTH_LONG).show()
            }

        }



    }
}