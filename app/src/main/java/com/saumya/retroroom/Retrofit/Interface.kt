package com.saumya.retroroom.Retrofit

import retrofit2.Call
import retrofit2.http.GET

interface GithubService{

@GET("developers")
fun getDevelopers(): Call<List<ResponseClass>>

}