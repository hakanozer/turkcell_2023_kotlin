package com.example.days_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import java.util.UUID

class MainActivity : AppCompatActivity() {

    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one = One()
        val oneBundle = Bundle()
        oneBundle.putString("key1","sendData1")
        one.arguments = oneBundle
        changeFragment(one)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn1.setOnClickListener {
            oneBundle.putString("key1", UUID.randomUUID().toString() )
            one.arguments = oneBundle
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