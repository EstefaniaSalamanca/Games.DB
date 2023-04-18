package com.example.gamesdb

import com.google.gson.annotations.SerializedName

data class GamesModel(
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: List<GameResponseItem>
)

data class GameResponseItem(

    @SerializedName("background_image") val image: String,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String

)