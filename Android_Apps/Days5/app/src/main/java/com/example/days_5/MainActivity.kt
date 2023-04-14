package com.example.days_5

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    lateinit var btnAlert:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlert = findViewById(R.id.btnAlert)

        var arr = resources.getStringArray(R.array.cities)
        for ( item in arr ) {
            Log.d("item", item)
        }


        btnAlert.setOnClickListener {

            var titleView = layoutInflater.inflate(R.layout.custom_alert, null)
            var alert = AlertDialog.Builder(this)
            alert.setCustomTitle(titleView)
            alert.setMessage("Are Sure!")
            alert.setCancelable(false)
            // buttons
            alert.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                Log.d("Yes", i.toString())
            })
            alert.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                Log.d("No", i.toString())
            } )
            //alert.setIcon(R.drawable.info_icon)
            alert.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

}