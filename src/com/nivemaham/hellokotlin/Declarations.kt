package com.nivemaham.hellokotlin

typealias Emp = Employee;
typealias EmpSet = Set<Emp>

fun declarations() {
    val number = 25
    val short: Short = 25

    var string: String

    string = "Test"
    string = "Me"

    val employee = Employee("Nive", 1)
    employee.name = "Nivethika"

    val employee2: Employee
    val number2 = 3;

    if (number2 < number) {
        employee2 = Employee("Tex", 2)
    } else {
        employee2 = Employee("Rex", 4)
    }

    val  employee3: Emp

}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if( other is Employee) {
            return  name == other.name && other.id == id;
        }

        return false;
    }

}