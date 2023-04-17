package com.example.gamesdb

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.gamesdb.databinding.ItemGameBinding

class GameViewHolder(view:View):RecyclerView.ViewHolder(view) {

    private val binding = ItemGameBinding.bind(view)

    fun bind(gameResponseItem: GameResponseItem){

        binding.tvGame.text = gameResponseItem.title

    }
}