package com.example.days_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.days_6.adapter.UserCustomAdapter
import com.example.days_6.services.UserService

class MainActivity : AppCompatActivity() {

    lateinit var listView:ListView
    val userService = UserService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.userListView)
        val customAdapter = UserCustomAdapter(this, userService.userResult())
        listView.adapter = customAdapter


    }
}