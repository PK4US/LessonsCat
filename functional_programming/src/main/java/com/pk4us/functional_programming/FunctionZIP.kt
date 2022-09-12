package com.pk4us.functional_programming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.javafaker.Faker
import com.pk4us.functional_programming.R

class functionZIP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zip_function)
//        task1() //генерирует 2 списка и обьеденяет в один
        task2() //генерирует 2 списка и обьеденяет в один
    }

    private fun task1() {
        val faker = Faker.instance()

        val listName = (1..100).map { faker.name().firstName() }
        val listNameFirst10 = listName.take(10)

        val listTel = (1..100).map { faker.number().digits(10)}
        val listTelFirst10 = listTel.take(10)

        val users = listNameFirst10.zip(listTelFirst10)
        for (user in users){
            Log.d("MyLog","Name: ${user.first}, Number: ${user.second}")
        }
    }

    private fun task2() {
        val faker = Faker.instance()

        val listFirstName = (1..100).map { faker.name().name()}
        val listLastName = (1..100).map { faker.name().lastName()}
        val fullName = listFirstName.zip(listLastName)
        Log.d("MyLog",fullName.toString())


        for (user in fullName){
            Log.d("MyLog","Name: ${user.first}, Number: ${user.second}")
        }
    }
}