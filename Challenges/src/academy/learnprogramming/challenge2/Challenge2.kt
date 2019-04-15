package academy.learnprogramming.challenge2

fun main() {

    val float1: Float? = -3847.384F
    val float2: Float? = -3847.384F

    println("floats are $float1 and $float2")

    val shortArray:  Array<Short> = arrayOf(1,2,3,4,5)

    val shortArray2 = shortArrayOf(1,2,3,4,5)

    val nullableArray = Array<Int?>(40) {i -> (i +1) * 5}

    for(num in nullableArray) {
        println(num)
    }

    val charArray = arrayOf('a', 'b', 'c')
    val javaRef = Challenge2Java()

    javaRef.method1(charArray.toCharArray())

    val primitiveCharArray = charArrayOf('a', 'b', 'd')
    javaRef.method1(primitiveCharArray)



    val x: String? = "I AM IN UPPERCASE"

    val y = x?.toLowerCase() ?: "I give up"
    println(y)

    val z = x?.let { it.toLowerCase().replace("am", "am not") }
    println(z)

    val myNonNulVar: Int? = null
    myNonNulVar!!.toDouble()
}