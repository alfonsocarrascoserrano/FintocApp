package com.example.banco.model

data class SenderAccount(
    val holder_id: String,
    val holder_name: String,
    val institution: Institution,
    val number: String
)