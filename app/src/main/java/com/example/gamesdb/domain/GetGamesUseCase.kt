package com.example.gamesdb.domain

import com.example.gamesdb.data.GamesRepository

import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val repository: GamesRepository) {

}
