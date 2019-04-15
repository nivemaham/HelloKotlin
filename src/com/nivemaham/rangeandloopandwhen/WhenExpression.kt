package com.nivemaham.rangeandloopandwhen

import java.math.BigDecimal

fun main() {

    val num = 100
    val ninehundred= 90
    when (num) {

        10, 11 -> println("10") // for more than one value
        100 -> println("100")
        1000 -> println("1000")
        in 15..24 -> println("from 15 to 24") // can use range with in
        ninehundred + 10 -> println("it is 100") // can use expressions
        else -> println("Doesn't fit")
    }


    val obj: Any = "I am a string"
    val objDecimal: Any = BigDecimal(25.4)

    val something: Any = obj

    if ( something is String)
        println("It is a string $something")
    else if(something is BigDecimal)
        println("It is a Decimal $something")
        // however, it is not possible to drop from one case to other, e,g, no break


    // equivalent in when

    when(something) {
        is String -> println("It is a string $something")
        is BigDecimal -> println("It is a decimal $something")
        is Int -> println("It is an Int")
    }

    // can use it as an expression

    val result: Any = when(something) {
        is String -> {
            println("It is a string")
            "test the string"
        }
        is BigDecimal -> {
            println("it is a decimal")
            BigDecimal(-1)
        }
        else -> {
            println("cannot find")
            "something is not correct"
        }
    }

    print(result)

    val timeOfYear = Seasons.FALL

    // when with enum can avoid else, if all the ENUM options are used
   val  seasonMessage = when(timeOfYear) {
        Seasons.FALL -> "Getting cooler"
        Seasons.SPRING -> "Flowers are blooming"
        Seasons.SUMMER -> "it is warm"
        Seasons.WINTER -> "X'mas is coming"
    }
    println(seasonMessage)

    // or use it with else, if one or more is not checked

    val someMessage = when(something) {
        Seasons.FALL -> "It is cold"
        else -> "I am fine"
    }
    println(someMessage)

    // can use when without a value

    val num2 = -50

    // can use this instead of if , else if, else
    when {
        num2 < num -> println("num is greater than num2")
        num2 > num -> println("num is less than num2")
        else -> "num is equal to num2"
    }

}

enum class Seasons {
    SPRING, SUMMER, WINTER, FALL
}
