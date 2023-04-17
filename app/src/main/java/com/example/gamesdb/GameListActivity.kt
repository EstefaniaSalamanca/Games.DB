package com.example.gamesdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gamesdb.databinding.ActivityGameListBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GameListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameListBinding
    private lateinit var retrofit: Retrofit

    private lateinit var adapter: GameAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrofit = getRetrofit()
        initUI()


    }

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
        binding.rvGame.layoutManager =LinearLayoutManager(this)
        binding.rvGame.adapter = adapter
    }


    private fun searchByName(query: String) {
        binding.progressBar.isVisible = true
        CoroutineScope(Dispatchers.IO).launch {
            val call: Response<GameResponse> =
                getRetrofit().create(ApiService::class.java).getGames("$query")
            val response= call.body()

            if (call.isSuccessful) {

                if (response != null)
                    Log.i("Estefania", response.toString())
                runOnUiThread {


                        adapter.updateList(response.games)

                    }
                    binding.progressBar.isVisible = false }

            } else {
                Log.i("Estefania", " no funciona")
            }

        }
    }


    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.freetogame.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
