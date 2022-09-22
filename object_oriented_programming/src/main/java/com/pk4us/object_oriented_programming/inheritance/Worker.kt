package com.pk4us.object_oriented_programming.inheritance

import android.util.Log

open class Worker(val name: String, val age: Int) {
    open fun work() {
        Log.d("MyLog", "Работаю")
    }
}