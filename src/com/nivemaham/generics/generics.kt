package com.nivemaham.generics

import java.lang.Appendable
import java.lang.StringBuilder
import java.math.BigDecimal

fun main() {

    // cannot declate a mutable list without specifying the type

//    val list: MutableList<>  this is not allowed
    val list: MutableList<String> = mutableListOf("String")

    list[0].toLowerCase();

    val bdList = mutableListOf(BigDecimal(34.65), BigDecimal(234.34))
    printGenericCollection(list)
    printGenericCollection(bdList)
    list.printExtCollection()


    append(StringBuilder("First name"), StringBuilder("Last name"))


    // here we can pass null

}

fun printCollection(collection: List<String>) {
    collection.forEach { println(it)}
}

// make function generic
fun <T>printGenericCollection(collection: List<T>) {
    collection.forEach { println(it)}
}

// write an extension function for generic list
fun <T> List<T>.printExtCollection() {
    forEach { println(it)}
}

// with specific upper bound in generics
fun <T: Number> List<T>.convertToInt() {
    forEach { println(it.toInt())}
}


// have more than one upper bound
fun <T> append(item1: T, item2: T)
    where T: CharSequence, T: Appendable {
    println("the result is ${item1.append(item2)}")
}

// <T> accepts null too, since <T> is equal to <T: Any?>