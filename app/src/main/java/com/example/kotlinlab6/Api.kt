package com.example.kotlinlab6

import android.provider.ContactsContract
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("characters")
    fun getCharacters(): Call<List<CharactersData>>
}


