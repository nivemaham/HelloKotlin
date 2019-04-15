package com.nivemaham.accessnidifiers


fun main() {

    val car = Car("Red", "Toyota", 2015)

    // named args
    val car2 = Car( color = "red", model = "Ford", year = 2019)
    println(car2)

    printColors(car, car2)

    val manyCards = arrayOf(car, car2)

    // use spread operator to unpack an array into elements
    printColors(*manyCards)

}

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

data class Car(val color: String, val model: String, val year: Int) {

}