package com.nivemaham.generics

fun main() {

    val strings = listOf("one", "two", "three")

    if (strings is List<String>) {
        println("this contains strings")
    }

    // this works, because the compiler already knows it is a List<String>

    // this will not work

    val stringsWithOther: Any = listOf("one", 2)
//    if (stringsWithOther is List<String>) { // here the compiler does not know it is String
//    }

//    if (stringsWithOther is List) { this also does not work, since you have pass a type to generics
//    }

    // this is called star projections.
    if (stringsWithOther is List<*>) {
        println("Yes it is. Star projections")
    }

}