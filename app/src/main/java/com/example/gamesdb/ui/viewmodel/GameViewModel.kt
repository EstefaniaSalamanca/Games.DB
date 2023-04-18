package com.example.gamesdb.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gamesdb.GamesModel
import com.example.gamesdb.domain.GetGameDetailUserCase
import com.example.gamesdb.domain.GetGamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(
    private val getGamesUseCase:GetGamesUseCase,
    private val getRandomGameUseCase:GetGameDetailUserCase

) : ViewModel() {

    val gamesModel = MutableLiveData<GamesModel>()
    val isLoading = MutableLiveData<Boolean>()



}