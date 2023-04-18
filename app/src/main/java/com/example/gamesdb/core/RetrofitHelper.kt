package com.example.gamesdb.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.rawg.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}