package com.nivemaham.nullref

fun main() {

    // cannot do this val str: String = null;
    var str2: String? = null;
//    str2 = "This has a value"

//    if (str2 != null) {
//        println(str2.toUpperCase())
//    }

    //or

    println(str2?.toLowerCase())

    val str3 = str2 ?: "This is my default"
    println(str3)

    val something: Any = arrayOf(1,2,3,4)

    val str4 = something as? String
    println(str4)


    val check : String? = "This is me"
    println(check!!.toString())
}