package com.example.gamesdb.domain

import com.example.gamesdb.data.GamesRepository
import javax.inject.Inject

class GetGameDetailUserCase @Inject constructor(private val repository: GamesRepository) {
}