package com.example.gamesdb.data

import com.example.gamesdb.GamesModel
import com.example.gamesdb.data.model.GamesProvider
import com.example.gamesdb.data.network.GamesService
import javax.inject.Inject

class GamesRepository @Inject constructor(
    private val api: GamesService,
    private val gamesProvider: GamesProvider
)

   /* }suspend fun getGames(): List<GamesModel> {
       val response = api.getGames()
     gamesProvider.games = response
      return response
    }
}*/