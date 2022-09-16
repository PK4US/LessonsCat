package com.pk4us.functional_programming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class with_and_let : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_and_let)

        main()
    }

    private val list: MutableList<Int>? = mutableListOf()

    private fun main() {
        list?.let {
            with(it) {
                for (i in 0 until 1000) {
                    add((Math.random() * 1000).toInt())
                }
                val result = filter { it % 2 == 0 }.take(10)
                for (i in result) {
                    Log.d("MyLog", i.toString())
                }
            }
        }

    }
}