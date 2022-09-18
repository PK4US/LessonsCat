package com.pk4us.object_oriented_programming.methods

import android.util.Log
import java.util.Calendar

class Worker(val name: String, val position: String, val startYear: Int) {
    val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work() {
        Log.d("MyLog", "Работаю")
    }
}