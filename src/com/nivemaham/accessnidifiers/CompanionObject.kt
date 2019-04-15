package com.nivemaham.accessnidifiers


fun main() {

    println("I am accessing private var ${MyClassWithStaticEquivalentVar.getPrivateVar()}")
    println("I am accessing private var ${MyClassWithStaticEquivalentVar.Companion.getPrivateVar()}")
}

class MyClassWithStaticEquivalentVar() {
   companion object {
       private val privateVar = 6
       fun getPrivateVar() = privateVar;
   }

}