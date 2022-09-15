package com.pk4us.functional_programming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.javafaker.Faker

class FlatMap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flat_map)

//        task1()
//        task2()
//        task3()
        task4()
    }

    private fun task1() {
        val revenueByWeek = listOf(
            listOf(1,2,3,4,5),
            listOf(6,7,8,9,10),
            listOf(11,12,13,14,15),
            listOf(16,17,18,19,20)
        )
        val total = mutableListOf<Int>()
        revenueByWeek.map {
            for (i in it){
                total.add(i)
            }
        }

        val average= total.average()
        Log.d("MyLog",average.toString())
    }

    private fun task2() {
        val revenueByWeek = listOf(
            listOf(1,2,3,4,5),
            listOf(6,7,8,9,10),
            listOf(11,12,13,14,15),
            listOf(16,17,18,19,20)
        )
        val total = revenueByWeek.flatten()
        Log.d("MyLog",total.toString())

        val average= total.average()
        Log.d("MyLog",average.toString())
    }

    private fun task3() {
        val data = mapOf(
            "file 1" to listOf(1,2,3,4,5),
            "file 2" to listOf(6,7,8,9,10),
            "file 3" to listOf(11,12,13,14,15)
        )
        val average= data.flatMap { it.value }.average()
        Log.d("MyLog",average.toString())

        val s= data.flatMap { it.value }
        Log.d("MyLog",s.toString())

        val i= data.map { it.value }
        Log.d("MyLog",i.toString())
    }

    private fun task4() {
        val data = mapOf(
            "file 1" to listOf(1,2,3,4,5),
            "file 2" to listOf(6,7,8,9,-10),
            "file 3" to listOf(11,12,-13,14,15)
        )
        val average1= data.flatMap { it.value }.average()
        Log.d("MyLog",average1.toString())

        val average2= data.filter { it.value.all { it>=0 } }.flatMap { it.value }.average()
        Log.d("MyLog",average2.toString())

    }
}