package com.example.gamesdb

import com.google.gson.annotations.SerializedName

data class GamesModel(
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: List<GameResponseItem>
)

data class GameResponseItem(

    @SerializedName("background_image") val image: GameImageResponse,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String

)
data class GameImageResponse(@SerializedName("url") val url: String)