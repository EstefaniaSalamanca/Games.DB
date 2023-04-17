package com.example.gamesdb

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/api/games")
    suspend fun getGames(query: String): Response<GameResponse>
}