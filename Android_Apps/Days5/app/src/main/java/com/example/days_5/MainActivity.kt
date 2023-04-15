package com.example.days_5

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var btnAlert:Button
    lateinit var btnContext:Button
    lateinit var listContext: ListView
    var itemSelect = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlert = findViewById(R.id.btnAlert)
        btnContext = findViewById(R.id.btnContext)
        listContext = findViewById(R.id.listContext)
        var arr = resources.getStringArray(R.array.cities)

        // context register
        registerForContextMenu(btnContext)
        registerForContextMenu(listContext)
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr)
        listContext.adapter = adapter

        for ( item in arr ) {
            Log.d("item", item)
        }
        btnAlert.setOnClickListener {
            alertDialog()
        }

        listContext.setOnItemLongClickListener { adapterView, view, i, l ->
            Log.d("posssition", arr[i])
            itemSelect = arr[i]
            false
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profile -> {
                Log.d("profile","Profile")
            }
            R.id.settings -> {
                Log.d("settings","settings")
            }
            R.id.logout -> {
                Log.d("logout","logout")
                alertDialog()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun alertDialog() {
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

    // Context Menu Config
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.main_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profile -> {
                Log.d("profile",itemSelect)
            }
            R.id.settings -> {
                Log.d("settings",itemSelect)
            }
            R.id.logout -> {
                Log.d("logout",itemSelect)
                alertDialog()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}