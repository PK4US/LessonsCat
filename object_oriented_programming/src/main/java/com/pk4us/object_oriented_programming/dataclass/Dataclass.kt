package com.pk4us.object_oriented_programming.dataclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R

class Dataclass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dataclass)

        val student1 = Student("Jack","Black",894547)
        val student2 = Student("Den","Drug",357292)
        val student3 = Student("Den","Drug",357292)
        val student4 = student3

        hashCode(student1,student2,student3,student4)
    }

    private fun hashCode(student1:Student, student2: Student, student3: Student, student4: Student){
        Log.d("MyLog", "student1 $student1")
        Log.d("MyLog", "student2 $student2")
        Log.d("MyLog", "student3 $student3")
        Log.d("MyLog", "student4 $student4")
        Log.d("MyLog", "")
        Log.d("MyLog", "student1 ${student1.hashCode()}")
        Log.d("MyLog", "student2 ${student2.hashCode()}")
        Log.d("MyLog", "student3 ${student3.hashCode()}")
        Log.d("MyLog", "student4 ${student4.hashCode()}")
        Log.d("MyLog", "")
        Log.d("MyLog", "student1 == student2 ${(student1 == student2)}")
        Log.d("MyLog", "student2 == student3 ${(student2 == student3)}")
        Log.d("MyLog", "student3 == student4 ${(student3 == student4)}")
        Log.d("MyLog", "")
        Log.d("MyLog", "student1 === student2 ${(student1 === student2)}")
        Log.d("MyLog", "student2 === student3 ${(student2 === student3)}")
        Log.d("MyLog", "student3 === student4 ${(student3 === student4)}")
    }
}