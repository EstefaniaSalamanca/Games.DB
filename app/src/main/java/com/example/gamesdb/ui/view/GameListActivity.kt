package com.example.gamesdb.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gamesdb.ui.viewmodel.GameAdapter
import com.example.gamesdb.GamesModel
import com.example.gamesdb.data.GamesRepository
import com.example.gamesdb.data.network.GamesService
import com.example.gamesdb.databinding.ActivityGameListBinding
import com.example.gamesdb.di.NetworkModule
import com.example.gamesdb.domain.GetGamesUseCase
import com.example.gamesdb.ui.viewmodel.GameViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Inject

@AndroidEntryPoint
class GameListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameListBinding
    private val gameViewModel: GameViewModel by viewModels()

    private lateinit var adapter: GameAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()


    }

    private fun initUI() {
        TODO("Not yet implemented")
    }
}
/*

    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchByName((query.orEmpty()))
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
        adapter = GameAdapter()
        binding.rvGame.setHasFixedSize(true)
        binding.rvGame.layoutManager = LinearLayoutManager(this)
        binding.rvGame.adapter = adapter
    }


    private fun searchByName(query: String?) {
        binding.progressBar.isVisible = true
        CoroutineScope(Dispatchers.IO).launch {


        if (myResponse.isSuccessful) {
                val response: GamesModel? = myResponse.body()
                if (response != null) {
                    Log.i("aristidevs", response.toString())

                        adapter.updateList(response.results)
                        binding.progressBar.isVisible = false


                }
                Log.i("aristidevs", "Funciona :)")
            } else {
                Log.i("aristidevs", "No funciona :(")
            }
        }
    }
*/




