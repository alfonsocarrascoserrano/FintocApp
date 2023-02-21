package com.example.fintocapp.model

data class Account(
    val balance: Balance,
    val currency: String,
    val holder_id: String,
    val holder_name: String,
    val id: String,
    val name: String,
    val number: String,
    val `object`: String,
    val official_name: String,
    val refreshed_at: String,
    val type: String
)