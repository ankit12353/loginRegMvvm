package com.android.loginsignupmvvm.network

import com.android.loginsignupmvvm.responses.LoginResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded

interface AuthApi {

    @FormUrlEncoded
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): LoginResponse
}