package com.nivemaham.generics

import java.math.BigDecimal

fun main() {


    // generics are erased at runtime.

    val mixedList = listOf("some text", BigDecimal(23.44), BigDecimal(45.55), 23)
//    val bigDecimalOnly = filter<BigDecimal>(mixedList) // not possibel


    // reification is a kotlin feature that prevents type features from being erased.
    val bigDecOnly = filterReified<BigDecimal>(mixedList)
    println(bigDecOnly)

    val stringOnly = filterReified<String>(mixedList)
    println(stringOnly)

    //NOTE: Use reified only when need to check for types within a function
    // cannot mark classes, properties for non inline fun as reified
}

//fun <T> filter(list: List<Any>): List<T> {
//    var newList = mutableListOf<T>()
//
//    for(item in list) {
//        if (item is T) { // this is not possible, since the generic type features are erased.
//            newList.add(item)
//        }
//    }
//    return newList
//}

// use reification in these case.
inline fun <reified T> filterReified(list: List<Any>): List<T> {
    var newList = mutableListOf<T>()

    for(item in list) {
        if (item is T) { // this is not possible, since the generic type features are erased.
            newList.add(item)
        }
    }
    return newList
}