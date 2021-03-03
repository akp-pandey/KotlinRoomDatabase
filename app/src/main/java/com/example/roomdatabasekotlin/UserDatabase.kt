package com.example.roomdatabasekotlin

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdatabasekotlin.dao.UserDao
import com.example.roomdatabasekotlin.model.User

@Database(entities = arrayOf(User::class),version = 1)
abstract class UserDatabase:RoomDatabase() {
    abstract fun userDao():UserDao
}