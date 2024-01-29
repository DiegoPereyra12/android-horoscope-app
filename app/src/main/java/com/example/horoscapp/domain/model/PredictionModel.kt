package com.example.horoscapp.domain.model

import com.google.gson.annotations.SerializedName

data class PredictionModel(
    val date: String,
    val horoscope: String,
    val icon: String,
    val id: Int,
    val sign: String
)