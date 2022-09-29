package com.pk4us.object_oriented_programming.companionObject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R

class CompanionObject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_companion_object)

        Log.d("MyLog", Calc.square(4).toString())
        Log.d("MyLog", Calc.lengthOfCircle(5f).toString())

        Log.d("MyLog", MyRandom.randomInt(5,10).toString())
        Log.d("MyLog", MyRandom.randomBoolean().toString())
        Log.d("MyLog", MyRandom.randomDayOfWeek())
    }
}