package com.kamil.room_testowanie

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey



/**
 * Created by Kamil on 03.01.2018.
 */
@Entity
class User {
    @PrimaryKey
    private val uid: Int = 0

    @ColumnInfo(name = "first_name")
     val firstName: String? = "name"

    @ColumnInfo(name = "last_name")
    private val lastName: String? = "name2"

    // Getters and setters are ignored for brevity,
    // but they're required for Room to work.
}