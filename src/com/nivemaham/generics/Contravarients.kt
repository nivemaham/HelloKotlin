package com.nivemaham.generics

fun main() {

    val fantasyBookCare = object: BookCare<FantasyBook> {
        override fun cleanBook(book: FantasyBook) {
            println("I am cleaning a fantasy book")
        }
    }

    val shelf = Shelf<FantasyBook>(listOf(FantasyBook(), FantasyBook()), bookCare = fantasyBookCare)

    shelf.arrangeBook(1)


    val fictionBookCare = object: BookCare<FictionBook> {
        override fun cleanBook(book: FictionBook) {
            println("I am cleaning a fantasy book")
        }
    }

    val fictionShelf = Shelf<FictionBook>(listOf(FictionBook(), FictionBook()), bookCare = fictionBookCare)

    fictionShelf.arrangeBook(1)


    // the above two codes are repetitive.
    // the cleanBook is the same for all kind of books. so we can have a BookCare<Book>

    val bookCare = object : BookCare<Book> {
        override fun cleanBook(book: Book) {
            println("I am cleaning a book")
        }
    }


    // now you can reuse the bookCare implementation
    val fictionBookCare2 = Shelf<FictionBook>(listOf(FictionBook(), FictionBook()), bookCare = bookCare)
    val fantasyBook2 = Shelf<FantasyBook>(listOf(FantasyBook(), FantasyBook()), bookCare = bookCare)

    // contravariants can only be used in in(param) positions

}

open class Book() {

}

class FantasyBook : Book() {

}

class FictionBook : Book() {

}

class Shelf<T: Book> (val books: List<T>, val bookCare: BookCare<T>) {

    fun pickBook(bookIndex: Int) = books[bookIndex]

    fun arrangeBook(bookIndex: Int) {
        bookCare.cleanBook(books[bookIndex])

    }

}


// can make this interface contravarient by adding in

interface BookCare<in T> {
    fun cleanBook(book: T)
}

