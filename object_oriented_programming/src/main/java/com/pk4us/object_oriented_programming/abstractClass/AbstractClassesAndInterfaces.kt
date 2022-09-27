package com.pk4us.object_oriented_programming.abstractClass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R


class AbstractClassesAndInterfaces : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstract_classes_and_interfaces)

//        task1()
        task2()
    }

    fun task1() {
        val workers = mutableListOf<Worker>()
        workers.add(Seller("Dan", 21))
        workers.add(Seller("Max", 37))
        workers.add(Seller("Max", 37))
        workers.add(Programmer("Sam", 28, "java"))
        workers.add(Programmer("Eugene", 23, "kotlin"))
        workers.add(Director("Nick",45))
        for (e in workers){
            e.work()
            e as Cleaner
            e.clean()
        }
    }

    fun task2() {
        val workers = mutableListOf<Worker>()
        workers.add(Seller("Dan", 21))
        workers.add(Seller("Max", 37))
        workers.add(Seller("Max", 37))
        workers.add(Programmer("Sam", 28, "java"))
        workers.add(Programmer("Eugene", 23, "kotlin"))
        workers.add(Director("Nick",45))
        val cleaners  = workers.filter { it is Cleaner }.map { it as Cleaner }
        for (cleaner in cleaners){
            cleaner.clean()
        }
    }
}