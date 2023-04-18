package com.example.gamesdb.di

import android.content.Context
import androidx.room.Room
import com.example.gamesdb.data.database.GamesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    private const val GAME_DATABASE_NAME = "game_database"

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, GamesDatabase::class.java, GAME_DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideGameDao(db: GamesDatabase) = db.getGameDao()
}