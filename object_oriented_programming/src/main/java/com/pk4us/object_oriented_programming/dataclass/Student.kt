package com.pk4us.object_oriented_programming.dataclass

class Student(val name: String, val lastName: String, val id: Int) {
    fun copy(name: String = this.name,lastName : String=this.lastName,id: Int = this.id):Student{
        return Student(name,lastName,id)
    }
}