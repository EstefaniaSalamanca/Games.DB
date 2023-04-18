package com.example.gamesdb.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "games_table")
data class GamesEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "game") val game: String,
    @ColumnInfo(name = "favourite") val favourite: Boolean
)


