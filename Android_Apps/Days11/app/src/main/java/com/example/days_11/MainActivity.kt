package com.example.days_11

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.days_11.configs.ApiClient
import com.example.days_11.configs.Util
import com.example.days_11.model.JWTData
import com.example.days_11.model.JWTUser
import com.example.days_11.services.DummyService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var editTextTextEmailAddress:EditText
    lateinit var editTextTextPassword:EditText
    lateinit var loginButton:Button
    lateinit var dummyService: DummyService

    lateinit var sharedPreferences:SharedPreferences
    lateinit var editor:Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = getSharedPreferences("users", MODE_PRIVATE)
        editor = sharedPreferences.edit()

        dummyService = ApiClient.getClient().create(DummyService::class.java)

        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress)
        editTextTextPassword = findViewById(R.id.editTextTextPassword)
        loginButton = findViewById(R.id.loginButton)
        loginButton.setOnClickListener(btnOnClickListener)

        val username = sharedPreferences.getString("username", "")
        editTextTextEmailAddress.setText(username)

    }


    val btnOnClickListener = View.OnClickListener {
        val email = editTextTextEmailAddress.text.toString()
        val pass = editTextTextPassword.text.toString()
        val jwtUser = JWTUser(email,pass)
        dummyService.login(jwtUser).enqueue(object : Callback<JWTData> {
            override fun onResponse(call: Call<JWTData>, response: Response<JWTData>) {
                val jwtUser = response.body()
                Log.d("status", response.code().toString())
                if (jwtUser != null) {
                    Util.user = jwtUser
                    Log.d("jwtUser", jwtUser.toString())

                    editor.putString("username", jwtUser.username)
                    editor.putString("firstName", jwtUser.firstName)
                    editor.commit()

                    val intent = Intent(this@MainActivity, Products::class.java)
                    startActivity(intent)
                    finish()
                }
            }
            override fun onFailure(call: Call<JWTData>, t: Throwable) {
                Log.e("login", t.toString())
                Toast.makeText(this@MainActivity, "Internet or Server Fail", Toast.LENGTH_LONG).show()
            }
        })
    }
}