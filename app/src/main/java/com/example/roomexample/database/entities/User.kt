package com.example.roomexample.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (
    @PrimaryKey val id: Int,
    @ColumnInfo(name="first_name", index = true)   val nombre: String?,
    val apellido: String?
)
