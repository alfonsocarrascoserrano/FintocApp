package com.example.banco.model

data class RecipientAccount(
    val holder_id: String,
    val holder_name: String,
    val institution: Institution,
    val number: String
)