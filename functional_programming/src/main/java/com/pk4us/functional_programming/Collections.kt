package com.pk4us.functional_programming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Collections : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collections)

        val data = mapOf(
            "Январь" to listOf(100, 100, 100, 100),
            "Февраль" to listOf(200, 200, -190, 200),
            "Март" to listOf(300, 180, 300, 100),
            "Апрель" to listOf(250, -250, 100, 300),
            "Май" to listOf(200, 100, 400, 300),
            "Июнь" to listOf(200, 100, 300, 300),
        )
        printInfo(data)
    }

    private fun printInfo(data: Map<String, List<Int>>) {
        val validData = data.filterNot { it.value.any { it < 0 } }

        val averageWeek = validData.flatMap { it.value }.average()
        Log.d("MyLog", "Средняя выручка в неделю: $averageWeek")

        val listOfSum = validData.map { it.value.sum() }
        Log.d("MyLog", "Список суммы выручки за каждую неделю: $listOfSum")

        val max = listOfSum.max()
        Log.d("MyLog", "Максимальная сумма выручки за месяц: $max")

        val min = listOfSum.min()
        Log.d("MyLog", "Минимальная сумма выручки за месяц: $min")

        val averageMonths = listOfSum.average()
        Log.d("MyLog", "Средняя выручка в месяц: $averageMonths")

        val maxMonths = validData.filter { it.value.sum() == max }.keys
        Log.d("MyLog", "Месяц максимальной: $maxMonths")

        val minMonths = validData.filter { it.value.sum() == min }.keys
        Log.d("MyLog", "Месяц минимальная: $minMonths")

        val invalidData = data.filter { it.value.any() { it<0 } }
        val errorMonths = invalidData.keys
        Log.d("MyLog", "Ошибки были в месяце: $errorMonths")

    }
}