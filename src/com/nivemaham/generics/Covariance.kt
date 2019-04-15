package com.nivemaham.generics

fun main() {

    val shortList: List<Short> = listOf(1,2,3,4,5)
    val mutableShortList: MutableList<Short> = mutableListOf(1,2,3,4,5)

    convertToInt(shortList)
//    convertToIntMutable(mutableShortList) // this does not work

    // List is a class
    // List<Number> is a type
    // List<Short> is a subtype of of List<Number>

    // the solution to the above is to treat List<Short> like a List<Number>, i.e. we want
    // List<Short> to be a subtype of List<Number>

    // if we want this kind of subtypes to be preserved during runtime, we should define the type param to be
    // COVARIANT

    // in the above example immutable list is covarient, mutable list is not covarient

}


// this works
fun convertToInt(collection: List<Number>) {
    for(num in collection) {
        println("The num is ${num.toInt()}")
    }
}

fun convertToIntMutable(collection: MutableList<Number>) {
    for(num in collection) {
        println("The num is ${num.toInt()}")
    }
}
// example of invarient definition

fun tendGarden(roseGarden: Garden<Rose>) {
//    waterGarden(roseGarden)// this does not work, because the Garden class is invarient
}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}

class Garden<T: Flower> {

}

class Rose: Flower() {

}


// example of covarient definition
// covarient classes are resritced.

fun tendFruitGarden(appleGarden: FruitGarden<Apple>) {
    waterMyGarden(appleGarden)
}

fun waterMyGarden(garden: FruitGarden<Fruit>) {

}

open class Fruit {

}

class Apple : Fruit() {

}

// by adding out keyword, the class is made covarient
// however this class can only be used in out(return) positions.

// COVARIENT CLASSES CAN/SHOULD ONLY BE READ
class FruitGarden<out T: Fruit> {

    val listOfFruits: List<T> = listOf()

    // we cannot have a function like like, since the T is an out.
    // which means it is a return type. not a parameter type


//    fun plantFruit(fruit: T) {
//        listOfFruit
//    }

    // you can use it as a parameter, when sure about the type and not changing the class.
    // or use it in constructor param or private prop
    fun checkAvailability(fruit: @UnsafeVariance T) {

    }

    fun pickFruit(i: Int): T = listOfFruits[i]

}
