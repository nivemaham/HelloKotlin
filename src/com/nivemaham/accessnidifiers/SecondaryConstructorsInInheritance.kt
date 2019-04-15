package com.nivemaham.accessnidifiers

open class Fruit {
   val name: String

    constructor(someName: String) {
        name = someName
    }
}

class Apple: Fruit {

    constructor(someOtherName: String): super(someName = someOtherName)
}


open class Watch(val price: Double) {
    var name: String = "Watch"

    constructor(someName: String, price: Double): this(price) {
        name = someName
        println("I am the watch")
    }
}

class Fitbit: Watch {

    constructor(someOtherName: String, price: Double): super(someName = someOtherName, price = price) {
        println("I am the Fitbit")
    }
}


data class DataClass(val number: Int)


fun main() {
    val watch = Watch(35.5)
    val watchWithName = Watch("SOME", 56.6)
    val fitbit = Fitbit("Fitbit", 98.5)


}