package com.example.roomexample.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomexample.database.dao.UserDao
import com.example.roomexample.database.entities.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}