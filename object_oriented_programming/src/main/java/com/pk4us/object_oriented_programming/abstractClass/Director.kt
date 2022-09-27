package com.pk4us.object_oriented_programming.abstractClass

import android.util.Log

class Director(name:String,age:Int):Worker(name,age) {
    override fun work() {
        Log.d("MyLog", "Управляю процессом")
    }
}