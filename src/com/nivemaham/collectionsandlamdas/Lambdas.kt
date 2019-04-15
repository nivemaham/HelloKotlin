package com.nivemaham.collectionsandlamdas

import java.time.Year

fun main() {
    // run can be used to run lamdas

    run { println("I am in a lamda")}


    val employees = listOf(Employee("John", "Smith", Year.of(2012)),
        Employee("Jane", "Smith", Year.of(2014)),
        Employee("Harry", "Johnson", Year.of(2015)),
        Employee("Tomy", "Mike", Year.of(2016)))


    // move the lamdas outside the () if it is the last parameter or the only param
    println(employees.minBy { employee -> employee.startYear })
    // instead of  println(employees.minBy ({ employee -> employee.startYear }))

    // when there is only one param and no need to infer the type, use it as the param
    println(employees.minBy { it.startYear })

    // lambdas can access mutable vars inside the class, unlike in java where you can only access final variables
    var num = 10

    run {
        num += 23
        println(num)
    }


    // member references, can use member reference if the member reference access some public properties or top level
    // functions which do not receive additional params.
    println(employees.minBy(Employee::startYear))
}

// cannot change num here, since all function params are final. can use them, but can't change them
fun useParameters(employees: List<Employee>, num: Int) {
    employees.forEach({
        println("${it.firstName} and num $num")
    })
}



data class Employee(val firstName: String, val lastName: String, val startYear: Year) {

}