package com.example.gamesdb.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gamesdb.GameResponseItem
import com.example.gamesdb.R
import com.example.gamesdb.ui.viewholders.GameViewHolder

class GameAdapter(var gameList: List<GameResponseItem> = emptyList()) :
    RecyclerView.Adapter<GameViewHolder>() {

    fun updateList(gameList: List<GameResponseItem>){
        this.gameList = gameList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {

        return GameViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_game, parent, false)
        )
    }

    override fun onBindViewHolder(viewholder: GameViewHolder, position: Int) {
        viewholder.bind(gameList[position])
    }

    override fun getItemCount() = gameList.size
}

