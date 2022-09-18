package com.pk4us.object_oriented_programming.OOP

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R

class OOP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oop)

//        task1()
//        task2()
        task3()
    }

    fun task1() {
        val user = User()
        user.name = null
        user.age = -15
        Log.d("MyLog", "Имя:${user.name}, Возраст: ${user.age}")
    }

    fun task2() {
        val user = User()
        user.age = 19
        user.age = -5
        user.age = 15
        user.age = -10
        Log.d("MyLog", "Возраст: ${user.age}")
    }

    fun task3() {
        val dog = Dog()

        dog.name = "jaCk"
        dog.age = -5
        dog.weight = -8

        Log.d("MyLog", "Кличка: ${dog.name}")
        Log.d("MyLog", "Возраст: ${dog.age}")
        Log.d("MyLog", "Вес: ${dog.weight}")
    }
}