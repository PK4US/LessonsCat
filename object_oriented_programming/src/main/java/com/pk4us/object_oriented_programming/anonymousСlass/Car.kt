package com.pk4us.object_oriented_programming.anonymousСlass

import android.util.Log
import java.util.jar.Attributes.Name

class Car(override var name: String = "Машина") : Transport(name) {
    override fun drive() {
        Log.d("MyLog", "Машина едет")
    }

    fun startEngine(): Boolean {
        Log.d("MyLog", "Запуск двигателя")
        return true
    }
}