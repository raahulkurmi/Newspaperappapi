package com.example.newspaperappapi

data class newdataclass(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)