package com.nivemaham.collectionsandlamdas

import java.lang.StringBuilder
import java.time.Year

fun main() {
    val employees = listOf(
        Employee("John", "Smith", Year.of(2012)),
        Employee("Jane", "Smith", Year.of(2014)),
        Employee("Harry", "Johnson", Year.of(2015)),
        Employee("Tomy", "Mike", Year.of(2016)))


    // lables when using nested when/with/apply

    "Some test here".apply {
        "Another string".apply {
            toLowerCase() // this will be on "Another string"

        }
    }


    "Some test here".apply  someString@ {
        "Another string".apply anotherString@ {
            this@someString.toLowerCase() // this will be on "some test string"

        }
    }
}

fun countToFifty(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append("100")
    return numbers.toString()
}


// with() converts the lambda passed into it into a receiver.
// so no need to use reference each time.
fun countToFiftyWith(): String {
//    val numbers = StringBuilder()
//    return with(numbers) {
    return with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append("100")
        toString()
    }

}

fun countToFiftyConsicely() = with(StringBuilder()) {
    for(i in 1..99) {
        append(i)
        append(", ")
    }
    append("100")
    toString()
}


// apply() is similar to with, but returns the receiver object. e,g here the stringBuilder
fun countToFiftyWithApply() = StringBuilder().apply {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append("100")
}.toString() // here apply() returns the stringbuilder



fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach {
        if(it.lastName == lastName) {
            println("Found it")
            // Local return
            return@forEach // this will return only the lambda

            // Non Local return
//            return // this will return lambda and function
        }
        println("No match")
    }
}

