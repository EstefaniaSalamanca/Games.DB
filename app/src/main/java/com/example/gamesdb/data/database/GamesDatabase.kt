package com.example.gamesdb.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.gamesdb.data.database.dao.GameDao
import com.example.gamesdb.data.database.entities.GamesEntity

@Database(entities = [GamesEntity::class], version = 1)
abstract class GamesDatabase: RoomDatabase() {

    abstract fun getGameDao(): GameDao
}