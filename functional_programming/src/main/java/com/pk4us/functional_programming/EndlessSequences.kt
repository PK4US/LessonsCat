package com.pk4us.functional_programming

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class EndlessSequences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter_and_map)

//        task1() //показывает первые п-элементов
//        task2() //показывает последние п-элементов
//        task3() //выкидывает первые п-элементов и показывет остальные
//        task4() //выкидывает последние п-элементов и показывет остальные
//        task5() //создает бессконечный массив и показывает первые п-элементов
//        task6() //создает бессконечный массив и показывает последние п-элементов (будет создаваться до окончания памяти)
//        task7() //создает бессконечный массив рандомных чисел и показывает первые п-элементов
        task8() //создает бессконечный массив строк, заменяя символ по индексу и выводит первые 100 элементов
    }

    private fun task1() {
        val array = (0..1000).toList()
        val sotrudnik = array.map { "Сотрудник №$it" }
        val first30 = sotrudnik.take(10)
        for (sot in first30) {
            Log.d("MyLog", sot)
        }
    }

    private fun task2() {
        val array = (0..1000).toList()
        val sotrudnik = array.map { "Сотрудник №$it" }
        val first30 = sotrudnik.takeLast(10)
        for (sot in first30) {
            Log.d("MyLog", sot)
        }
    }

    private fun task3() {
        val array = (0..100).toList()
        val sotrudnik = array.map { "Сотрудник №$it" }
        val first30 = sotrudnik.drop(90)
        for (sot in first30) {
            Log.d("MyLog", sot)
        }
    }

    private fun task4() {
        val array = (0..100).toList()
        val sotrudnik = array.map { "Сотрудник №$it" }
        val first30 = sotrudnik.dropLast(90)
        for (sot in first30) {
            Log.d("MyLog", sot)
        }
    }

    private fun task5() {
        val array = generateSequence(0) { it + 2 }
        val arraylist = array.take(10)
        for (i in arraylist) {
            Log.d("MyLog", i.toString())
        }
    }

    private fun task6() {
        val array = generateSequence(0) { it + 2 }
        val arraylist = array.drop(10)
        for (i in arraylist) {
            Log.d("MyLog", i.toString())
        }
    }

    private fun task7() {
        val array = generateSequence{(Math.random() * 20).toInt()}
        val arraylist = array.take(10)
        for (i in arraylist) {
            Log.d("MyLog", i.toString())
        }
    }

    private fun task8() {
        val array = generateSequence ("Сотрудник: 1" ){
            val index = it.substring(11).toInt()
            "Сотрудник: ${index + 1}"
        }
        val listOfFirst100 = array.take(100)
        for (employee in listOfFirst100){
            Log.d("MyLog", employee.toString())
        }
    }
}