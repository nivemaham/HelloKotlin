package com.nivemaham.rangeandloopandwhen

fun main() {

    // if evaluates to a value
    var num: Int = if (35<70) 50 else 100
    println(num)

    val someCondition = 789 > 56756

    // if using if as expression, else is a must
    val result = if (someCondition) {
        println("True")
        8789
    } else {
        println(false)
        9798498
    }

    // if using if as a value, no need for else
    if (someCondition) { // this will return a Unit
        println("value ")
    }

    println(result)
    println(if (someCondition) {
        println("something")
        67
    } else {
        println("something else")
        433
    })



}