package com.example.roomdatabasekotlin.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Data class is used to hold only data
@Entity   //Entity annotation for making this model as entity
data class User(
    @PrimaryKey
    val userId:Int,
    @ColumnInfo(name = "first_name")
    val firstName:String,
    @ColumnInfo(name = "last_name")
    val lastName:String
)