package com.example.sqlitecomroom.data

class UserRepository(private val userDao: UserDao) {

    val selectUser = userDao.selectUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}