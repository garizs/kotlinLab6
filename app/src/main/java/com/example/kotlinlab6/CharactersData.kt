package com.example.kotlinlab6

import com.google.gson.annotations.SerializedName

data class CharactersData(
    @SerializedName("name")
    val name: String,

    @SerializedName("img")
    val img: String,

    @SerializedName("nickname")
    val nickname: String,

)