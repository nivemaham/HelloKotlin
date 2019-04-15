package com.nivemaham.accessnidifiers

class Utils {
    fun upperFirstAndLast(string: String): String {
        val upperFirst = string.substring(0, 1).toUpperCase() + string.substring(1)
        return upperFirst.substring(0,upperFirst.length-1) + upperFirst.substring(upperFirst.length-1, upperFirst.length).toUpperCase();
    }
}


// extension function.
fun String.upperFirstAndLast(): String {
    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0,upperFirst.length-1) + upperFirst.substring(upperFirst.length-1, upperFirst.length).toUpperCase();
}

fun main() {
    println(Utils().upperFirstAndLast("this is the one"))

    val string = "this is using the extended function"
    println(string.upperFirstAndLast())
}