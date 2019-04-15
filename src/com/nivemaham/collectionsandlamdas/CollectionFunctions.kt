package com.nivemaham.collectionsandlamdas

import com.nivemaham.accessnidifiers.Car

fun main() {

    // filter functions

    val immutableMap = mapOf(
        1 to Car("red", "ford", 2019),
        2 to Car("blue", "toyota", 2013),
        "John" to Car("White", "benz", 2012),
         "Harry" to Car("Black", "porche", 2016)
    )

    val from2016 = immutableMap.filter { it.value.year == 2016 }
    val ofJohn = immutableMap.filter { it.key == "John" }

    println(ofJohn)

    val withOutHarry = immutableMap.filterNot { it.key == "Harry" }
    println(withOutHarry)

    val list = mutableListOf(1,2,3,4,5)
    println(list)

    val plusTenList = list.map { it.plus(10) }
    println(list)
    println(plusTenList)

    val yearsOfCars = immutableMap.map { it.value.year } // this will return a list of years. No need to call the collections.toList
    println(yearsOfCars)

    // checking whether all elem meets a condition
    val isNew = immutableMap.all { it.value.year > 2010}
    println(isNew)

    val any2020 =immutableMap.any {it.value.year == 2020}

    val howManyLaterThan2015 = immutableMap.count {it.value.year > 2015}
    println(howManyLaterThan2015)

    // find from list returns the first item that meets the criteria. not a collection
    val carsList = immutableMap.values
    val theFirstBlueInHouse = carsList.find {it.color == "blue"}

//    val sortedMap = immutableMap.toSortedMap() // does not work if the the map is of any. should provide a comparator for this.
}