package com.example.gamesdb.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gamesdb.GamesModel
import com.example.gamesdb.di.NetworkModule
import com.example.gamesdb.domain.GetGameDetailUserCase
import com.example.gamesdb.domain.GetGamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(retrofit: Retrofit,
    private val getGamesUseCase:GetGamesUseCase,
    private val getRandomGameUseCase:GetGameDetailUserCase

) : ViewModel() {
    val retrofit = NetworkModule

    val gamesModel = listOf<GamesModel>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getGamesUseCase
        }

    }
    fun searchByName(query: String?){
    }

    }
