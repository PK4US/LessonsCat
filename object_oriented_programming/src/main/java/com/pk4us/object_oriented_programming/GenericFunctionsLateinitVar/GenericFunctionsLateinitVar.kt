package com.pk4us.object_oriented_programming.GenericFunctionsLateinitVar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.Generic.MyArrayList
import com.pk4us.object_oriented_programming.Generic.MyList
import com.pk4us.object_oriented_programming.R

class GenericFunctionsLateinitVar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic_functions_lateinit_var)

        val list: MyList<String> = MyArrayList()
        for (i in 0..100){
            list.add(i.toString())
        }

        for (i in 0..90){
            list.removeAt(  0)
        }

        for (i in 0 until list.size()){
            Log.d("MyLog", list.get(i))
        }
    }
}