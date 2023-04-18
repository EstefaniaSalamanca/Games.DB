package com.example.gamesdb.data.network

import androidx.room.util.query
import com.example.gamesdb.GamesModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GamesService @Inject constructor(private val api:GamesApiClient){



    suspend fun getGames(): List<GamesModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getGames("query")
            response.body() ?: emptyList()
        }
    }

}
