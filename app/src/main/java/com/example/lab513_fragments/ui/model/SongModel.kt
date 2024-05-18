package com.example.lab513_fragments.ui.model

data class SongModel (//mapear solo los datos que requiero
    val id: Int,
    val image: Int,
    val songName: String,
    val album: String,
    val numberSong: String,
    val artist: String,
    val songTime: String
)