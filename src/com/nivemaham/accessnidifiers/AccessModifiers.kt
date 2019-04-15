package com.nivemaham.accessnidifiers

fun main() {
    val emp = Employee("john")
    println(emp.firstname)
}

class Employee constructor(firstname: String) {

    val firstname: String

    init {
        this.firstname = firstname;
    }
}

class Employee1 constructor(firstname: String) {

    val firstname: String = firstname;


}

class Employee2 constructor(val firstname: String) {

}

class Employee4 (val firstname: String) {

}