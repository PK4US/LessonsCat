package com.pk4us.object_oriented_programming.methods

import android.util.Log

class Cat(val name: String, val age: Int, var weight: Float = 0f) {
    fun printInfo() {
        Log.d("MyLog", "Кличка: $name ,Возраст: $age ,Вес: $weight")
    }

    fun isOld() = age >= 12

    val isTold:Boolean
    get() = weight >=10
}