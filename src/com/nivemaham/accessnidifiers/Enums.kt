package com.nivemaham.accessnidifiers



enum class Department {
    IT, HR, SALES
}

// can add vars to enums
enum class DepartmentCount(val department: String, val count: Int) {
    IT("IT", 5), HR("HR", 5), SALES("SALES", 5)
}

// if adding a function should add a semicolon at the end
enum class DepartmentCountInfo(val department: String, val count: Int) {
    IT("IT", 5), HR("HR", 5), SALES("SALES", 5);

    fun getDepartmentInfo() = "This is $department department with $count employees"
}

fun main() {
    println(DepartmentCountInfo.HR.getDepartmentInfo())
}