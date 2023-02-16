package com.example.mtglifetracker.network

import com.example.banco.model.Accounts
import com.example.banco.model.Movements
import com.example.banco.secret_key
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*


interface ApiService {
    @Headers("Authorization: $secret_key")
    @GET("accounts")
    suspend fun getAccounts(
        @Query("link_token") link_token: String
    ): Accounts

    @Headers("Authorization: $secret_key")
    @GET("accounts/{accountid}/movements")
    suspend fun getMovements(
        @Path("accountid") accountid: String,
        @Query("link_token") link_token: String
    ): Movements

    companion object{
        var apiService:ApiService? = null
        fun getInstance() : ApiService{
            if (apiService == null){
                apiService = Retrofit.Builder()
                    .baseUrl("https://api.fintoc.com/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            }
            return apiService!!
        }
    }
}