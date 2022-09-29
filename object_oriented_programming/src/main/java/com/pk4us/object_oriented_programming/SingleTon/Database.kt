package com.pk4us.object_oriented_programming.SingleTon

object Database {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()
    fun insertData(str:String){
        data.add(str)
    }
}