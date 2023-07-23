package com.example.newspaperappapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface apiinterface {
    @GET("top-headlines")
    fun getData(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("apiKey") apiKey: String
    ): Call<newdataclass>

}