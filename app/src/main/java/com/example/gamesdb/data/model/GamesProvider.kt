package com.example.gamesdb.data.model

import com.example.gamesdb.GamesModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GamesProvider @Inject constructor(){
    companion object {
        var games: List<GamesModel> = emptyList()

    }
}
