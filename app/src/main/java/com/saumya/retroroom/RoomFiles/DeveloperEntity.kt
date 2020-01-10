package com.saumya.retroroom.RoomFiles

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity
class DeveloperEntity {

@PrimaryKey(autoGenerate = true)
var id:Int=0

@ColumnInfo(name="Developer_Name")
var name:String=""

@ColumnInfo(name="GithubLink")
var url:String=""

var avatar:String=""
}