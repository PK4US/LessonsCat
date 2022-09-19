package com.pk4us.object_oriented_programming.hashCode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R

class HashCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equals)

        val kyiv = Address("kyiv","rubana",113)
        val kyiv2 = Address("kyiv","rubana",113)
        val kyiv3 = kyiv
//        equals(kyiv,kyiv2,kyiv3)
        hashcode(kyiv,kyiv2,kyiv3)


    }

    fun equals(kyiv: Address, kyiv2: Address, kyiv3: Address){
        if (kyiv == kyiv2){ Log.d("MyLog", "Yes") }else{ Log.d("MyLog", "No") }
        if (kyiv == kyiv3){ Log.d("MyLog", "Yes") }else{ Log.d("MyLog", "No") }
        if (kyiv.equals(kyiv3)){ Log.d("MyLog", "Yes") }else{ Log.d("MyLog", "No") }
    }

    fun hashcode(kyiv: Address, kyiv2: Address, kyiv3: Address){
        Log.d("MyLog", kyiv.hashCode().toString())
        Log.d("MyLog", kyiv2.hashCode().toString())
        Log.d("MyLog", kyiv3.hashCode().toString())


    }
}