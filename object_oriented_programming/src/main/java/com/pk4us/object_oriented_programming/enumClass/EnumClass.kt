package com.pk4us.object_oriented_programming.enumClass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R

class EnumClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enum_class)
        task1()
        task2()
    }

    fun task1() {
        val month = "Июль"
        val season = when (month) {
            "Декабрь", "Январь", "Февраль" -> "Зима"
            "Март", "Апрель", "Май" -> "Весна"
            "Июнь", "Июль", "Август" -> "Лето"
            "Декабрь", "Январь", "Февраль" -> "Осень"
            else -> "Не найдено"
        }
        Log.d("MyLog", season.toString())
    }

    fun task2() {
        val month = Month.SEPTEMBER
        val season = when (month) {
            Month.DECEMBER, Month.JANUARY, Month.FEBRUARY -> Season.WINTER
            Month.MARCH, Month.APRIL, Month.MAY -> Season.SPRING
            Month.JUNE, Month.JUL, Month.AUGUST -> Season.SUMMER
            Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER -> Season.AUTUMN
        }
        Log.d("MyLog", season.toString())
    }
}