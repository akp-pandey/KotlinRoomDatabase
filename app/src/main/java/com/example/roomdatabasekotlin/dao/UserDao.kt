package com.example.roomdatabasekotlin.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.roomdatabasekotlin.model.User

@Dao //Annotation for Database Access Object
interface UserDao {
    @Query("SELECT * FROM User")  // for getting all data
    fun getAll():List<User>

    @Insert        // for inserting data in database
    fun insert(user: User)

    @Delete   // for deleting data from database
    fun delete(user: User)
}