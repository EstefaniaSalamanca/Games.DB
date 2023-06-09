package com.example.gamesdb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import com.example.gamesdb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGoIn.setOnClickListener {
            navigateToGameListActivity()
        }
    }


    private fun navigateToGameListActivity() {
        val intent = Intent(this, GameListActivity::class.java)
        startActivity(intent)
    }
}
