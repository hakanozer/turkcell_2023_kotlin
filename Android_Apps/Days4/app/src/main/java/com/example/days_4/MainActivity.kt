package com.example.days_4

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.core.view.get
import java.util.UUID

class MainActivity : AppCompatActivity() {

    lateinit var cityListView: ListView
    lateinit var txtData: EditText
    lateinit var btnAddData: Button
    var arr = mutableListOf<String>()
    var arrIndex = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dataResult()

        cityListView = findViewById(R.id.cityListView)
        txtData = findViewById(R.id.txtData)
        btnAddData = findViewById(R.id.btnAddData)

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr)
        cityListView.adapter = adapter

        btnAddData.setOnClickListener {
            var item = txtData.text.toString()
            arr.add(item)
            adapter.notifyDataSetChanged()
            txtData.setText("")
            txtData.requestFocus() // imleci bu alana getir
            selectResult()
        }

        // click
        cityListView.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, Detail::class.java)
            intent.putExtra("data", arr.get(i))
            startActivity(intent,)
            Log.d("Click", i.toString())
        }

        // long click
        cityListView.setOnItemLongClickListener { adapterView, view, i, l ->
            if ( i == 5 ) {
                false
            }else {
                arr.removeAt(i)
                var item = arr.get(i)
                Log.d("item", item)
                adapter.notifyDataSetChanged()
                view.setBackgroundColor(Color.RED)
                arrIndex.add(i)
                true;
            }
        }
    }

    fun selectResult() {
        for (item in arrIndex) {
            Log.d("item", item.toString())
        }
    }

    fun dataResult() {
        for (item in 0..20) {
            arr.add("$item - Title - ${UUID.randomUUID()}" )
        }
    }
}

