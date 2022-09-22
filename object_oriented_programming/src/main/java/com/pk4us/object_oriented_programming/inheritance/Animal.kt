package com.pk4us.object_oriented_programming.inheritance

import android.util.Log

open class Animal(val name:String, var weight:Float, var habitats:String) {
    open fun eat(){
        Log.d("MyLog", "eat")
    }
    open fun run() {
        Log.d("MyLog", "run")
    }
}