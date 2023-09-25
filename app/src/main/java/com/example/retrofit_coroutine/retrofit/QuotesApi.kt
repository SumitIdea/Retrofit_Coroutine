package com.example.retrofit_coroutine.retrofit
// Retrofit interface

import com.example.retrofit_coroutine.model.Data
import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {
    @GET("/quotes")
    suspend fun getQuotes() : Response<Data>
}
