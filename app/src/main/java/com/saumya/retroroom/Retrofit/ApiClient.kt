package com.saumya.retroroom.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    
    val retroClient = Retrofit.Builder()
            .baseUrl("https://github-trending-api.now.sh/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    
    val service = retroClient.create(GithubService::class.java)
    
   
}