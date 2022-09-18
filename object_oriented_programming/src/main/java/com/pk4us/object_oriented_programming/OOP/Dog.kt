package com.pk4us.object_oriented_programming.OOP

class Dog {

    var name: String = "rgergregeg"
        get() {
            return if (field == null) {
                ""
            } else {
                field.lowercase().replaceFirstChar { it.titlecase() }
            }
        }
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var weight: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}