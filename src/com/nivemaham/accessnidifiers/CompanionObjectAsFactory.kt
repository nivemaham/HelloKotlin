package com.nivemaham.accessnidifiers




class Shirt private constructor(val color: String) {

    val price = 5;

    companion object {

        fun ofColor(color: String) = Shirt(color)
    }

}



fun main() {
    val shirt = Shirt.ofColor("Green")
    val shirtOther = Shirt.ofColor("Red")

    println("This is shirt is ${shirt.color} and costs ${shirt.price}")
    println("This is shirt is ${shirtOther.color} and costs ${shirtOther.price}")
}