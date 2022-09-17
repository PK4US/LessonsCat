package com.pk4us.functional_programming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Extension : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension)
        task1()
        task2()
        task3()
        task4()
        task5()
        task6()
    }

    fun task1(){
        val age = 5
        if (age in 6..100){
            println("ok")
        }
    }

    fun task2(){
        val age = 5
        if (age.isAgeValid()){
            println("ok")
        }
    }
    private fun Int.isAgeValid() = this in 6..100

    fun task3(){
        val age = 5
        Log.d("MyLog",age.isPositive().toString())
    }
    private fun Int.isPositive() = this >= 0

    fun task4(){
        val text = ""
        Log.d("MyLog",text.isNotEmpty().toString())

    }

    fun task5(){
        val value = 15
        Log.d("MyLog",value.isPrime().toString())
    }
    private fun Int.isPrime():Boolean {
        if (this <=3) return true
        for (i in 2 until this){
            if (this % i == 0)return false

        }
        return true
    }

    fun task6(){
        val obj = mutableMapOf<String,String>()
        myWith(obj){
            keys
            values
        }
    }
    private inline fun <T,R> myWith(obj:T, operation:T.() ->R):R{
        return obj.operation()
    }
}