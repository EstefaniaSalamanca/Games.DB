package com.example.gamesdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import com.example.gamesdb.databinding.ActivityGameListBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GameListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameListBinding
    private lateinit var retrofit: Retrofit
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrofit=getRetrofit()
        initUI()


    }

    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchBtName(query.orEmpty())
                return false

            }

            override fun onQueryTextChange(newText: String?) = false


        })
    }

    private fun searchBtName(query: String) {

    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.rawg.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}