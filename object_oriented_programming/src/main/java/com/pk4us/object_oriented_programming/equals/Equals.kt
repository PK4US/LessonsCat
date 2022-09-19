package com.pk4us.object_oriented_programming.equals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pk4us.object_oriented_programming.R
import com.pk4us.object_oriented_programming.hashCode.Address

class Equals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equals)

        val kyiv = Address("kyiv","rubana",113)
        val kyiv2 = Address("kyiv","rubana",113)
        val kyiv3 = kyiv


        if (kyiv == kyiv2){
            Log.d("MyLog", "Yes")
        }else{
            Log.d("MyLog", "No")
        }


        if (kyiv == kyiv3){
            Log.d("MyLog", "Yes")
        }else{
            Log.d("MyLog", "No")
        }


        if (kyiv.equals(kyiv3)){
            Log.d("MyLog", "Yes")
        }else{
            Log.d("MyLog", "No")
        }
    }
}