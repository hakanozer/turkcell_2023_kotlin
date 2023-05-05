package com.example.days_12.configs

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiClient {

    private val Base_URL = "https://randomuser.me/"
    private var retrofit:Retrofit? = null

    val client = OkHttpClient.Builder()
        .readTimeout(60, TimeUnit.SECONDS)
        .build()

    fun getClient() : Retrofit {
        if ( retrofit == null ) {
            retrofit = Retrofit
                .Builder()
                .baseUrl(Base_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
        }
        return retrofit as Retrofit
    }

}