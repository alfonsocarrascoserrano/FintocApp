package com.example.banco.model

data class Movement(
    val amount: Int,
    val comment: String?,
    val currency: String,
    val description: String,
    val id: String,
    val `object`: String,
    val pending: Boolean,
    val post_date: String,
    val recipient_account: RecipientAccount?,
    val reference_id: String?,
    val sender_account: SenderAccount?,
    val transaction_date: String?,
    val type: String
)