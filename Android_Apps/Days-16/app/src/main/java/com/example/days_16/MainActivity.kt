package com.example.days_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one = One()
        val onuBundle = Bundle()
        onuBundle.putString("key1","sendData1")
        one.arguments = onuBundle
        changeFragment(one)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn1.setOnClickListener {
            onuBundle.putString("key1","sendData11")
            one.arguments = onuBundle
            changeFragment(one)
        }
        btn2.setOnClickListener {
            val two = Two()
            changeFragment(two)
        }
        btn3.setOnClickListener {
            val three = Three()
            changeFragment(three)
        }

    }


    fun changeFragment ( fragment: Fragment ) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }

}