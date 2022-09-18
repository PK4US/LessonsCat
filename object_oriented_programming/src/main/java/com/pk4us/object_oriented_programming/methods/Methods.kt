package com.pk4us.object_oriented_programming.methods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R

class Methods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_methods)
//        task1()
        val programmer = Worker("Jack","programmer",2020)
        programmer.printInfo()
    }


    fun task1(){
        val cat = Cat("Барсик",15,15f)


        Log.d("MyLog", "Инфа: ${cat.printInfo()}")
        Log.d("MyLog", "Старый: ${cat.isOld()}")
        Log.d("MyLog", "Толстый: ${cat.isTold}")
        cat.weight = 5f
        Log.d("MyLog", "Толстый: ${cat.isTold}")
    }

    fun Worker.printInfo(){
        Log.d("MyLog", "$name,$position,$startYear,$experience")

    }
}