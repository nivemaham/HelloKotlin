package com.nivemaham.accessnidifiers

import java.time.Year

object CompanyCopyright {
    val currentYear = Year.now().value

    fun getTagLine() = "This is me in $currentYear"

}

fun main() {
    println(CompanyCopyright.getTagLine())
}