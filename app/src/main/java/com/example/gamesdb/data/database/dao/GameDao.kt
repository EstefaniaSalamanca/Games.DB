package com.example.gamesdb.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.gamesdb.data.database.entities.GamesEntity

@Dao
interface GameDao {

    @Query("SELECT * FROM quote_table ORDER BY author DESC")
    suspend fun getAllGames():List<GamesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(games:List<GamesEntity>)

    @Query("DELETE FROM quote_table")
    suspend fun deleteAllGames()
}
