package com.example.days_10.configs

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private val Base_URL = "https://dummyjson.com/"
    private var retrofit:Retrofit? = null

    fun getClient() : Retrofit {
        if ( retrofit == null ) {
            retrofit = Retrofit
                .Builder()
                .baseUrl(Base_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit as Retrofit
    }

}