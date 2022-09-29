package com.pk4us.object_oriented_programming.anonymousСlass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R

class Anonymous : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anonymous)
        task1()
        task2()

        val car = Car()
        task3(car)

        task4()
    }

    fun task1() {
        val car: Transport = Car()
        if (car !is Car) return
        car.name = "Машина 2"
        Log.d("MyLog", car.name)
    }

    fun task2() {
        val car:Transport = Car()
        val bicycle: Transport = Bicycle()
        if (car !is Car || car.startEngine()) return
    }

    fun task3(transport: Transport) {
        transport.drive()
    }

    fun task4() {
        val sportsman = Sportsman()
        sportsman.invokeWaterBoy(object : WaterBoy{
            override fun bringWater(){
                Log.d("MyLog", "Вода принесена")
            }
        })
    }
}