package com.example.gamesdb.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels

import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gamesdb.ui.adapters.GameAdapter
import com.example.gamesdb.databinding.ActivityGameListBinding
import com.example.gamesdb.ui.viewmodel.GameViewModel
import dagger.hilt.android.AndroidEntryPoint

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
        gameViewModel.onCreate()


    }



    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.progressBar.isVisible = true

                gameViewModel.searchByName(query.orEmpty())
                binding.progressBar.isVisible = false

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
}







