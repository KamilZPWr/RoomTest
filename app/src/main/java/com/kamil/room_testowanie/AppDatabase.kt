package com.kamil.room_testowanie

import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database



/**
 * Created by Kamil on 03.01.2018.
 */

@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}