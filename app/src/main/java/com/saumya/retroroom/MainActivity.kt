package com.saumya.retroroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

import com.saumya.retroroom.Retrofit.ApiClient.service
import com.saumya.retroroom.Retrofit.ResponseClass
import com.saumya.retroroom.RoomFiles.AppDatabase
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    
    val db: AppDatabase by lazy { Room.databaseBuilder(this, AppDatabase::class.java,
    "DeveloperDB").build()  }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        
        service.getDevelopers().enqueue(object : Callback<List<ResponseClass>> {
            override fun onFailure(call: Call<List<ResponseClass>>, t: Throwable) {
            
            }
    
            override fun onResponse(call: Call<List<ResponseClass>>, response: Response<List<ResponseClass>>) {
                Log.e("Response",response.body().toString())
            }
    
        })
        
        
    }
}
