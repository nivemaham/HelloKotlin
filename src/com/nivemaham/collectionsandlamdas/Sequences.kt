package com.nivemaham.collectionsandlamdas

import com.nivemaham.accessnidifiers.Car

fun main() {
    val immutableMap = mapOf(
        1 to Car("red", "ford", 2019),
        2 to Car("blue", "toyota", 2013),
        "John" to Car("White", "benz", 2012),
        "Harry" to Car("Black", "porche", 2016)
    )

    // sequences
    // it is better to use sequences  when performing a lot of chained lambda operations.
    // similar to streams in java

    immutableMap.filter { it.value.model == "ford" } // creates first coll instance
        .map { it.value.color } // creates second coll inst

    // by using sequences you can avoid intermediate collections.

    // no need to use sequence if the collection is small
    val sequence = immutableMap.asSequence()
        .filter { it.value.color == "ford" }
        .map { it.value.color }
    // the above won't be executed
    // intermediate operations return sequences, terminal operators do not return sequences
    // intermediate operators are lazy. will not evaluate if terminal operations are not called

    val sequenceWithTerminal = immutableMap.asSequence()
        .filter { it.value.model == "benz" }
        .map { it.value.color }
        .toList()
    // this will be executed.


    // sequences are better when using find operation.
    // find will terminated when the first match is found. no need to iterate the whole collection

}
