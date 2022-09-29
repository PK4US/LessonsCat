package com.pk4us.object_oriented_programming.companionObject

class Calc {
    companion object {
        private const val PI = 3.14
        fun square(num: Int) = num * num
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }
}