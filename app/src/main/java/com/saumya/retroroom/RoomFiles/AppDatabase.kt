package com.saumya.retroroom.RoomFiles

import androidx.room.Database
import androidx.room.RoomDatabase


/*DAO class contains the methods to access data*/

@Database(entities = [DeveloperEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

abstract fun devsDao(): DevDAO

}