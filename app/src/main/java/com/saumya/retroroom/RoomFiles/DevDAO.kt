package com.saumya.retroroom.RoomFiles

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface DevDAO {

@Insert
fun addDeveloper(dev:List<DeveloperEntity>)

}