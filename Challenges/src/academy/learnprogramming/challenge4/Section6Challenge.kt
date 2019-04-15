package academy.learnprogramming.challenge4


fun main(args: Array<String>) {

    // using a range, print 5, 10, 15, 20, 25... 5000, each number
    // on a separate line

    for (i in 5..5000 step 5) {
        println(i)
    }

    // using a range, -500..0, each number on a separate line

    val range2 = -500..0
    range2.forEach{println(it)}

    // using a range, print the first 15 numbers in the
    // Fibonacci sequence, each
    // number on a separate line
    // Hint: you'll have to print the first one or two numbers
    // outside the range
    // 0, 1, 1, 2, 3, 5, 8...

    val fibArray = arrayOfNulls<Int>(15)
    for( i in 0 until 15 ) {
        val num = when {
            i == 0 -> 0
            i == 1 -> 1
            i > 1 -> fibArray[i-1]?.plus(fibArray[i-2] ?: 0)
            else -> 0
        }
        fibArray[i] = num;
    }

    fibArray.forEach { println(it) }

    // Modify the following code so that it prints the following,
    // each number on a separate line
    // 1, 11, 100, 99, 98, 2

    firstLoop@ for (i in 1..5) {
        println(i)
        if (i == 2)
            break@firstLoop
        secondLoop@ for (j in 11..20) {
            println(j)
            thirdLoop@ for (k in 100 downTo 90) {
                println(k)
                if (k == 98)
                    continue@firstLoop
            }
        }
    }



    // Declare a variable called num (int) and assign it whatever you want
    // Declare a variable called dnum (double) and assign it as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    // do all of the above (declaring dnum and assigning
    // it) in one statement/expression

    // Then print the value of dnum - separate statement

    val num: Int = 6787
    val dnum: Double = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else ->  0.0
    }

    println(dnum)
}