package com.pk4us.object_oriented_programming.GenericFunctionsLateinitVar

interface MyList<T> {
    fun get(index:Int): T
    fun add(string: T)
    fun remove(element:T)
    fun removeAt(index:Int)
    fun size():Int

}