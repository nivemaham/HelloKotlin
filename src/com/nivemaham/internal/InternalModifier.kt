package com.nivemaham.internal

import java.time.Year

object CompanyCopyright {
    val currentYear = Year.now().value

    fun getTagLine() = "This is me in $currentYear"

    internal fun getCopyrightLine() = "Copyright \u00A9 nivemaham"

}


fun main() {
    println(CompanyCopyright.getTagLine())
    println(CompanyCopyright.getCopyrightLine())
}