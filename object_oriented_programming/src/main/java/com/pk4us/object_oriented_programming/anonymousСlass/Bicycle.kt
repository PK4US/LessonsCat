package com.pk4us.object_oriented_programming.anonymousСlass

import android.util.Log

class Bicycle() : Transport("Велосипед") {
    override fun drive() {
        Log.d("MyLog", "Велосипед")

    }
}