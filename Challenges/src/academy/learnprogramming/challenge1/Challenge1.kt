package academy.learnprogramming.challenge1

fun main() {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    var var1: Int = 2988

    val valImmutable: Any = "The Any type is the root of the Kotlin class hierarchy"

    if (valImmutable is String) {
        println(valImmutable.toUpperCase())
    }

    val ones = """    1
        |   11
        |  111
        | 1111
                """.trimMargin()
    println(ones)

    val onesWithOne = """1    1
        1   11
        1  111
        1 1111
                """.trimMargin("1")
    println(onesWithOne)



}