package com.pk4us.object_oriented_programming.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pk4us.object_oriented_programming.R

class Inheritance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inheritance)

//        task1()
        task2()
    }

    fun task1() {
        val dog = Dog(5f)
        println(dog.habitats)
    }

    fun task2() {
        val worker = mutableListOf<Worker>()
        worker.add(Worker("Dan", 21))
        worker.add(Worker("Max", 37))
        worker.add(Programmer("Sam", 28, "java"))
        worker.add(Programmer("Eugene", 23, "kotlin"))
        for (e in worker){
            e.work()
        }
    }
}