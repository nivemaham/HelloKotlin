package com.nivemaham.imports

// can import top level functions from other classes, similar to classes
import com.nivemaham.accessnidifiers.DataClass
import com.nivemaham.accessnidifiers.Department
import com.nivemaham.accessnidifiers.DepartmentCountInfo.IT as ITInfo
import com.nivemaham.accessnidifiers.upperFirstAndLast
import com.nivemaham.imports.someotherpac.getTopFunction


fun main() {
    println(getTopFunction())

    val dataClass = DataClass(5)
    println("This is a String".upperFirstAndLast())

    println(Department.IT)
    println(ITInfo.getDepartmentInfo())
}