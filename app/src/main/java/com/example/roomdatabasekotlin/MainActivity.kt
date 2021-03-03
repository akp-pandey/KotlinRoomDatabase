package com.example.roomdatabasekotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.roomdatabasekotlin.model.User
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thread {
            val database=Room.databaseBuilder(applicationContext,UserDatabase::class.java,"databse-name")
                .build()
            val user=User(5,"Kaushal","Pandey")
            database.userDao().insert(user)
            Log.d("The value in the database is",database.userDao().getAll().toString())
        }
    }
}