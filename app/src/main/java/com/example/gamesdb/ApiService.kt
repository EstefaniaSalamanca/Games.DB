package com.example.gamesdb

import retrofit2.http.GET

interface ApiService {

    @GET("api/{games}+key=810cb77d13da42098dd499839649f21b")
    suspend fun getGames()
}