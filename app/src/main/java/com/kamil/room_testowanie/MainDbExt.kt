package com.kamil.room_testowanie

import android.arch.persistence.room.Room
import android.widget.Toast
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.doAsyncResult
import org.jetbrains.anko.uiThread

/**
 * Created by Kamil on 03.01.2018.
 */

fun MainActivity.databaseConnection() {
    MainActivity.database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "myDb")
            .allowMainThreadQueries()
            .build()

    val listOfUsers = mutableListOf(User())

    doAsync {
        MainActivity.database.userDao().insertAll(listOfUsers[0])
    }
}

fun MainActivity.getUsers() : List<User> {
    var listOfUsers: List<User>
    doAsyncResult {
        listOfUsers = MainActivity.database.userDao().all
        uiThread {
            Toast.makeText(applicationContext,
                    listOfUsers[0].firstName, Toast.LENGTH_LONG).show()
        }


    }
    return listOf(User())
}
