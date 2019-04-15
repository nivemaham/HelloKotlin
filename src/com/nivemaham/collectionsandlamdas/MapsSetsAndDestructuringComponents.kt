package com.nivemaham.collectionsandlamdas

import com.nivemaham.accessnidifiers.Car

fun main() {


    val immutableMap = mapOf(1 to Car("red", "ford", 2019),
        2 to Car("blue", "toyota", 2013))

    println(immutableMap)
    println(immutableMap.javaClass) // java.util.LinkedHashMap


    val mutableMap = mutableMapOf("John" to Car("White", "benz", 2012),
        "Harry" to Car("Black", "porche", 2016))

    println(mutableMap.javaClass) // java.util.LinkedHashMap

    val hashMap = hashMapOf(1 to  2) // get hashmap and it is mutable

    val pair = Pair(1, "one")

    println(pair.first)
    println(pair.second)

    // destructuring declaration
    // making val of public properties
    val (firstVal, secondVal) = pair
    println(firstVal == pair.first)


    for ((key, value) in mutableMap) {
        println("Key $key value $value")
    }

    // to have destructuring declarations possible, should implement component functions.
    val cat = Cat("timmy", 12)

    // now can use destructuring declarations for Cat
    val (name, age) = cat
    println("this is $name and she is $age")

    val dog = Dog("Doggy", 3)
    val (dogName, dogAge) = dog

    val set = setOf(1,2,3,4) // immutable, any operation will return a new object

    val mutableset = mutableSetOf(4,7, 8)
    mutableset.plus(5)// this also returns a new instance, it doesn't change the instance

    set.drop(2) // drops first two elem
}

class Cat(val name: String, val age: Int) {

    // for destrcturing the properties should be public
    operator fun component1() = name
    operator fun component2() = age

}

// for data class all the component functions are implemented by default
data class Dog(val name: String, val age: Int){

}