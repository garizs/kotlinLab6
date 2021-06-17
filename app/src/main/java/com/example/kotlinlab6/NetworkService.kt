package com.example.kotlinlab6

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkService {
    private var BASE_URL = "https://www.breakingbadapi.com/api/"
    private var retrofit= Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getApi() : Api{
        return retrofit.create(Api::class.java)
    }
}

