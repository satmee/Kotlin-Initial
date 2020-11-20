fun main(args : Array<String>) {
    val big = 42
    val small = 74
    var i: Int = 0

    /** If condition **/
    var maxValue: Int = if (big > small)
        big
    else
        small
    println(maxValue)

    /** When condition or Switch case which we find in C, C++, Java **/
    val school : Int = 75 /* Initializing a value already */
    when (school) {
        42 -> println("The number is 4!") /* case 1: to check if it is 42 !*/
        in 70..80 -> println("Lies within the range 70-80!") /* To check within the range of the number */

        else -> {
            println("I don't know!") /* Default condition*/
        }
    }

    /** For Loop **/
    for( i in 1..5)
    {
        println("Hey")
    }
    /** While Loop **/
    while(i<5){
        println("You")
        i++
    }
    /** Do- While Loop **/
    do{
        println("there")
        i++
    }while ( i <= 2 )
    /** Implementing condition in loop **/
    for( i in 1..10)
    {
        if (i % 2 == 0)
        println(i)
    }
    println("Use of Break:")

    /** Break Statement **/
    myLoop@ for (i in 1..3){ // Naming the first loop as myLoop
        for(j in 1..3){
            println("$i $j")
            if ( i==2 && j==2) // Break statement condition
                break@myLoop // Breaking the first loop

        }
    }
    println("Use of Continue:")
    /** Continue Statement **/
    outer@ for (i in 1..3){ // Naming the first loop as myLoop
        for(j in 1..3){
            println("$i $j")
            if ( i==2 && j==2) // Break statement condition
                continue@outer // Breaking the first loop
        }
    }
}