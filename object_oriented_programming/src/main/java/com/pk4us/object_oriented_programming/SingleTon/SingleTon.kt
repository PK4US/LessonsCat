package com.pk4us.object_oriented_programming.SingleTon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R

class SingleTon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_ton)

        val db = Database
        db.insertData("1")
        db.insertData("2")
        Log.d("MyLog", db.data.toString())

        val test = Test()
        test.insertTestData("3")
        test.insertTestData("4")
        Log.d("MyLog", db.data.toString())
    }
}