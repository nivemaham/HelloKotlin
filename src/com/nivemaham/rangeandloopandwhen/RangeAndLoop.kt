package com.nivemaham.rangeandloopandwhen





fun main() {
    val range = 1..10

    println( 2 in range)
    println( 1 in range)
    println( 10 in range)
    println( 13 in range)

    val stringRange = "AB".."XY" // but cannot loop through string range.
    println("Z" in stringRange)

    // but can use loop in String, since string class has implemented the iterator

    val reversedRange = 10.downTo(1)
    val reversedRange2 = range.reversed()

    val rangeWithStep = 1..10
    val stepTwoRange = rangeWithStep.step(2)
    val stepFourRange = 1..100 step 5
    rangeWithStep.forEach { println(it) }
    stepTwoRange.forEach { println(it) }
    reversedRange.forEach { println(it) }
    stepFourRange.forEach { println(it) }

    for (i in range) {
        println(i)
    }


    //reverse for loop
    for (i in 20 downTo 10 step 1) {
        println(i)
    }

    //exclude the last value

    for(i in 1 until 10) { // this will be 1 to 9
        println(i)
    }

    val seasons = arrayOf("spring", "summer", "fall", "winter")

    for (season in seasons) {
        println(season)
    }

    println("winter" in seasons)
    println("rainy" in seasons)
    println("rainy" !in seasons)
    println( 32 !in 2..5)

    // indices extention function

    for( index in seasons.indices) {
        println(index)
    }

    seasons.indices.forEach { println(it) }
    seasons.forEachIndexed {index: Int, s: String -> println("the value of index $index is $s") }

    // you can give loops name

    for ( i in 1..3) {
        println("first")
        for (j in 4..6) {
            println("seconds")
            if ( j ==6) {
                break // only breaks the second loop
            }
        }
    }


    firstLoop@ for ( i in 1..3) { // give name firstLoop to this loop
        println("first")
        secondLoop@ for (j in 4..6) {
            println("seconds")
            if ( j ==6) {
                break@firstLoop // breaks from the first loop
//                continue@secondLoop // works for continue too
            }
        }
    }
}