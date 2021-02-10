package com.android.loginsignupmvvm.responses

data class User(
    val access_token: String,
    val created_at: String,
    val email: String,
    val email_verified_at: String,
    val id: Int,
    val name: String,
    val updated_at: String
)