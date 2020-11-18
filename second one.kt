

/*Data types in kotlin are all objects, that is why their first letter starts with capital letter
All the variables must be initialized as there is no default value!
Now, var is used to store a variable but val is used to sore a constant value!*/

fun main(args : Array<String>){
    /** Data Types **/
    var name : String = "Hello"
    /*Or, var name : String
    * name = "Hii"*/
    var age : Int = 45
    var marks : Float = 45.98f /* For float value mention F or f*/
    var percentage : Double = 74.36
    /** Range **/
    val r1 = 1..5 /*Rnage from 1-5*/
    val r2 = 5 downTo(1) // Shows the range : 5 4 3 2 1*/
    val r3 = 5 downTo(1) step 2 // Shows the range : 5  3  1*/
    var ispresent = '5' in r3 /* Seraching an element*/
    var countDown = 10.downTo(1) /* Countdown*/
    var countDown = 1.rangeTo(10)/* Opposite of downTO*/
    /** Interpolation **/
    println("The age is : $age") /* Can also write like ${age}*/

    println("A demo of string interpolation: $marks")
    println("Length of the string is ${name.length}") /* Length of the string*/
    /*Perform arithmatic operation using string interpolation*/
    val a = 74
    val b = 41
    println("The sum of $a and $b is ${a+b}")

    /* Implementing class and using string interpolation*/
     var pie = circle()
    pie.radius = 4.8f
    println("The given radius is ${pie.radius} cm and the area is ${3.14 * pie.radius * pie.radius} cm-sq")

}

/*The interpolation*/
class  circle{
    var radius : Float = 0f
}




