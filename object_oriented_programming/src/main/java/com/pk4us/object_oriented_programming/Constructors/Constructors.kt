package com.pk4us.object_oriented_programming.Constructors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R

class Constructors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constructors)

        val ukraine = Country("Ukraine",44000000)
        Log.d("MyLog", ukraine.name)

        val littlePrince = Book("littlePrince",1999,155)
//        littlePrince.name = "hello"
        littlePrince.year = 1778
    }
}