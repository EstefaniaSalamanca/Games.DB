package com.example.gamesdb.data.network

import com.example.gamesdb.GamesModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GamesApiClient {
    @GET("/api/games?page_size=900569&key=810cb77d13da42098dd499839649f21b")
    suspend fun  getGames(@Query("search") search:String): Response<List<GamesModel>>
}