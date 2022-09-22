package com.pk4us.object_oriented_programming.inheritance

import android.util.Log

class Programmer(name: String, age: Int, val language: String) : Worker(name, age) {

    override fun work() {
        Log.d("MyLog", "Пишу код на $language")
    }
}