package com.pk4us.object_oriented_programming.inheritance

import android.util.Log

class Dog(weight:Float ):Animal("собака",weight,"суша") {
    override fun eat(){
        Log.d("MyLog", "Кушаю кость")
    }
}