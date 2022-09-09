package com.pk4us.functional_programming.filter_and_map

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.javafaker.Faker
import com.pk4us.functional_programming.R
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        task1()
//        task2()
//        task3()
//        task4()
        task5()
    }

    private fun task1() {
        val listOfNumbers = mutableListOf<Int>()
        for (i in 0..99) {
            listOfNumbers.add(i)
        }
        val listOfEvenNumber = listOfNumbers.filter { it % 2 == 0 }
        for (i in listOfEvenNumber) {
            Log.d("MyLog",i.toString())
        }
    }

    // Функция сохраняет в массив из 100 имен и выводит на экран имена начинающие на "А"
    private fun task2() {
        val faker = Faker.instance()
        val listName = (1..100).map { faker.name().firstName() }
        val listNameWithA = listName.filter{ it.startsWith('A') }

        Log.d("MyLog",listNameWithA.toString())
    }

    private fun task3() {
        val numbers = (0..100).toList()
        Log.d("MyLog",numbers.toString())

        val doubleNumbers = numbers.map{it*2}
        Log.d("MyLog",doubleNumbers.toString())

        for (i in doubleNumbers){
            Log.d("MyLog",i.toString())
        }
    }

    private fun task4() {
        val array = arrayOf(8,10,15,124,14,10,0,-6,-85,74,1235,154,960,1,-987)
        val sortArray = array.sorted()
        Log.d("MyLog",sortArray.toString())

        val sortArrayDescending = array.sortedDescending()
        Log.d("MyLog",sortArrayDescending.toString())
    }

    private fun task5() {
        val randomValues = List(100) { Random.nextInt(0, 1000) }
        val values = randomValues.filter { it % 5 == 0 && it % 3 == 0}.map { it*it }.sortedDescending().map { "$it" }
        Log.d("MyLog",values.toString())
    }
}