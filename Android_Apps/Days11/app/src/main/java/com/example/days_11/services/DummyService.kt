package com.example.days_11.services

import com.example.days_11.model.JWTData
import com.example.days_11.model.JWTUser
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface DummyService {

    @POST("/auth/login")
    fun login( @Body jwtUser: JWTUser ): Call<JWTData>

}