package com.pk4us.object_oriented_programming.abstractClass

import android.util.Log

class Seller(name:String,age:Int):Worker(name,age),Cleaner {
    override fun work() {
        Log.d("MyLog", "Продаю товар")
    }
    override fun clean(): Unit {
        Log.d("MyLog", "Продавец убирает")
    }
}