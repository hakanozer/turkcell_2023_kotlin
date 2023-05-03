package com.gultendogan.gulten_dogan_odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val xml = XmlResult()

        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        val arr = xml.xmlCurrency()
        val dovizIsim = mutableListOf<String>()
        for (item in arr) {
            dovizIsim.add(item.Isim)
        }

        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteSeason)
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, dovizIsim)
        autoCompleteTextView.setAdapter(adapter)

        autoCompleteTextView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            for (item in arr) {
                if (selectedItem == item.Isim){
                    println("ARANAN DEĞER : ${item.Isim}")
                    forexAlısText.setText(item.ForexBuying)
                    forexSatisText.setText(item.ForexSelling)
                    banknotAlimiText.setText(item.BanknoteBuying)
                    banknotSatisiText.setText(item.BanknoteSelling)
                    break
                }
            }
        }

    }
}