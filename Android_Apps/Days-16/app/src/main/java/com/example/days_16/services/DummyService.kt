package com.example.days_16.services

import com.example.days_16.models.AddBasket
import com.example.days_16.models.BasketResult
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface DummyService {

    @POST("carts/add")
    fun addBasket( @Body addBasket: AddBasket ) : Call<BasketResult>

}