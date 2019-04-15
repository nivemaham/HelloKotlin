package com.nivemaham.collectionsandlamdas


fun main() {

    // immutable collections cannot be modified, e,g, no add or remove
    // immutable collections implement covarients
    // mutables can be modified

    val strings = listOf("spring", "summer")
    println(strings.javaClass) // uses Arrays.ArrayList from java. The java class is mutable.

    val notNullList = listOfNotNull("hello", null, "there") // this will filter out nulls
    println(notNullList)

    val arrayList = arrayListOf(1,2,3,4)
    println(arrayList.javaClass)

    val mutableList = mutableListOf(1,2,3,4)
    println(mutableList.javaClass) // these two will with java.util.ArrayList


    // additional functions from Kotlin

    val lastelem = strings.last()

    // reverse a list
    val reversed = strings.reversed()

    // getAnElemOrNullPointerException
    strings.getOrNull(5)

    // create a pair of two list of same length

    val paired = strings.zip(notNullList)
    println(paired)

    //concatinating list

    val combined = strings + notNullList


    // Pair is a Kotlin class

    // merge without duplicates
    val nonDupList = strings.union(notNullList)

    //removing duplicates
     val noDuplicates = strings.distinct()


}