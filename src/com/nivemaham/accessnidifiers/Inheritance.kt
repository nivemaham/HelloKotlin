package com.nivemaham.accessnidifiers


open class Printer(val modelName: String) {

}


class LaserPrinter(modelName: String): Printer(modelName) {

}



abstract class Book(val name: String) {
    open fun printModel() = println("the book is $name")

    abstract fun getPrice(): Double
}

open class FantasyBook(name: String) : Book(name) {
    override fun getPrice(): Double = 2345.904

    final override fun printModel() = println("This is a fantasy book called $name")
}

class SpecialFantasyBook(name: String, val price: Int): FantasyBook(name) {

    override fun getPrice(): Double {
        return price.toDouble()
    }
}

fun main() {
    val book = FantasyBook("Harry potter")
    book.printModel()
    println("The price is ${book.getPrice()}")

    val book2 = SpecialFantasyBook("Lord of the rings", 34)
    book.printModel()

    println("this special book price is ${book2.getPrice()}")
}