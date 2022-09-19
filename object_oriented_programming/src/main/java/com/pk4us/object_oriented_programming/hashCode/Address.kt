package com.pk4us.object_oriented_programming.hashCode

class Address( val city: String? = null, val street: String? = null, val numberOfHouse: Int? = null) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (city != other.city) return false
        if (street != other.street) return false
        if (numberOfHouse != other.numberOfHouse) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city?.hashCode() ?: 0
        result = 31 * result + (street?.hashCode() ?: 0)
        result = 31 * result + (numberOfHouse ?: 0)
        return result
    }
}