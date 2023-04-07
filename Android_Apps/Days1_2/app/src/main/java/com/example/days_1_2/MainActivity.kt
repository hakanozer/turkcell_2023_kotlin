package com.example.days_1_2

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.days_1_2.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var btnGotoSettings: Button
    lateinit var txtData: EditText
    lateinit var txtViewData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGotoSettings = findViewById(R.id.btnGotoSettings)
        txtData = findViewById(R.id.txtData)
        txtViewData = findViewById(R.id.txtViewData)

        var btnBackColor = btnGotoSettings.backgroundTintList?.defaultColor
        btnGotoSettings.setOnClickListener {
            var data = txtData.text.toString()
            Toast.makeText(this, data, Toast.LENGTH_LONG).show()
        }

        // OnChange
        txtData.addTextChangedListener {
            txtViewData.text = it.toString()
            if ( it.toString() == "zehra@mail.com" ) {
                btnGotoSettings.setBackgroundColor(Color.RED)
            }else {
                btnGotoSettings.setBackgroundColor(btnBackColor!!)
            }
        }

    }


    /*
    fun btnClick( view:View ) : Unit {
        //view.setBackgroundColor(Color.RED)
        var btn:Button = view as Button
        var title = btn.text
        Log.i("", title.toString())
        var data = txtData.text.toString()
        Toast.makeText(this, "btnClick :" +data, Toast.LENGTH_LONG).show()
    }
     */


}