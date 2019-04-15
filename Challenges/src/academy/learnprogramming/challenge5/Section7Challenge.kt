package academy.learnprogramming.challenge5


fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)


    val (fName, lName, age) = joe

    println("fName = $fName, lName = $lName , age = $age")

    val immutableMap = mapOf(joe.lastName to joe,
        jane.lastName to jane,
        mary.lastName to mary,
        john.lastName to john,
        jean.lastName to jean)


    println(immutableMap.count{ it.value.lastName.startsWith("S")})

    val listOfPair = immutableMap.map { Pair(it.value.firstName, it.value.lastName) }
    println(listOfPair)

    immutableMap.also {it.map { println("${it.value.firstName} is ${it.value.age} years old")}}

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)

    val intersection = list1.intersect(list2)
    println(intersection)

    val filterIntersect = list1.filter { it in list2 }

    val regularPaper = Box<Regular>()

    var paper = Box<Paper>()

    paper = regularPaper

}


data class Person(val firstName: String, val lastName: String, val age: Int) {

}


class Box<out T> {


}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}