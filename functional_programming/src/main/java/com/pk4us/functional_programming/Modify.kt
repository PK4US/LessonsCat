package com.pk4us.functional_programming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Modify : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modify)

        val result = modifyString("hello") { it.uppercase() }
        Log.d("MyLog", result.toString())

        val resultInt = (0..100).toList()
        modifyArrayInt(resultInt){
            Log.d("MyLog", it.sum().toString())
        }
    }

    fun modifyString(string: String, modify: (String) -> String): String {
        return modify(string)
    }

    fun modifyArrayInt(list: List<Int>, operator:(List<Int>)->Unit){
        return operator(list)
    }
}