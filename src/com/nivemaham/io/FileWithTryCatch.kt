package com.nivemaham.io

import java.io.DataInputStream
import java.io.EOFException
import java.io.File
import java.io.FileInputStream

fun main() {

    val di = DataInputStream(FileInputStream("testfile.txt"))
    var string: String

    try {
        while (true) {
            string = di.readUTF()
            println(string)
        }
    } catch (e: EOFException) {

    }

    // try with resources
//    di.use { it.readUTF() }

    // walk function accepts a direction to walk the file directory
    // walkUp or walkDown

    // work with project dir structure

    File(".").walkTopDown().forEach { println(it)}
}