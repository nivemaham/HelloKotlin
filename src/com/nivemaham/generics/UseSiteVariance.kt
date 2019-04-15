package com.nivemaham.generics

import java.security.CodeSource
import javax.print.attribute.standard.Destination

fun main() {

    val cars1 = listOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()

    copyCars(cars1, cars2)

    val fords = listOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()

//    copyCars(fords, fords2) // hre fords2 don't work, since mutablelist in invariant
    copyGenericCars(fords, fords2)
    copySuperClassesToo(fords2, cars2)

}

// type projection or site varience
fun <T: Car> copySuperClassesToo(source: MutableList< out T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}

fun <T> copyGenericCars(source: List<T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}

fun copyCars(source: List<Car>, destination: MutableList<Car>) {
    for (car in source) {
        destination.add(car)
    }
}


// List<? extends Car> is covarient

open class Car() {

}

class Ford : Car() {

}

class Toyota : Car() {

}