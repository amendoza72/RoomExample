package com.example.roomexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.roomexample.database.AppDatabase
import com.example.roomexample.database.entities.User
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {
            databaseAccess()
        }
    }

    suspend fun databaseAccess(){
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "DDBB"
        ).build()


        val userDao = db.userDao()

        var user = User(1, "Antonio", "Mendoza")
        userDao.insertAll(user)
        val users: List<User> = userDao.getAll()

        val i = 0
    }
}