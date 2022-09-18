package com.pk4us.object_oriented_programming.OOP

class User {
    var age: Int = 0
    set(value) {
        if (value >=0){
            field = value
        }
    }
    var name: String? = null
        get() {
            return if (field == null) {
                ""
            } else {
                field
            }
        }
}