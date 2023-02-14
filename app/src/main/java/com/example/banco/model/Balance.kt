package com.example.banco.model

data class Balance(
    val available: Int,
    val current: Int,
    val limit: Int
)