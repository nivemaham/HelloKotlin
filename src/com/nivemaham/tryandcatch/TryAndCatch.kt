package com.nivemaham.tryandcatch

import java.lang.IllegalArgumentException
import java.lang.IndexOutOfBoundsException
import java.lang.NumberFormatException

fun main() {

    println(getNumber("5"))
    println(getNumber("23.4"))

    val result = getItem(4) ?: IllegalArgumentException("The Index is not available")
    println(result)

    val result2 = getItem(40) ?: IllegalArgumentException("The index is not available")
    println(result2)
}

fun getNumber(string: String): Int {
    return try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("Finally")
        // cannot return anything here

        // no value from finally will be returned.
    }
}


val myArray = arrayOf(1,2,4,5,6,6,7)

fun getItem(index: Int): Int? {
    return  try {
        myArray.get(index)
    } catch (e: IndexOutOfBoundsException) {
        null
    }

}