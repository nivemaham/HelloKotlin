package com.nivemaham.io

import java.io.File

fun main() {

    val file = File("testfile.txt").reader().readLines()

    file.forEach{println(it)}

    val reader = File("testfile.txt").reader()
    val lines = reader.readText()
    reader.close()
    // close the reader

    // another way
    File("testfile.txt").reader().use { it.readText() }


    // read by lines
    File("testfile.txt").reader().forEachLine { println(it) }

    // use useLines
    File("testfile.txt").reader().useLines { it.forEach { println(it) }}


}