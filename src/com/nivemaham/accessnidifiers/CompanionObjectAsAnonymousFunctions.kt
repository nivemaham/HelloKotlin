package com.nivemaham.accessnidifiers

interface MyRepository {
    fun getItem() : String
}


class MyService() {

    fun editMyItem(repo: MyRepository) = repo.getItem() + " Edited"
}

fun main() {

    val myText = "edit here"
    // this is not necessarily a singleton
    // the obj will be used and discarded
    val editedItem = MyService().editMyItem(object : MyRepository {
        override fun getItem(): String = "This is an item"
    })

    println(editedItem)

    val editedItemWithLocalVar = MyService().editMyItem(object : MyRepository {
        override fun getItem(): String = myText
    })
    println(editedItemWithLocalVar)



}