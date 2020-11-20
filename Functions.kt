fun main(args : Array<String>) {
    add() // This is Method for case 1
    var multiply = product(5,4) // Case 2, return type
    println("The product is:$multiply")
    var largestNum = max(7,50) // For One Line Function
    println("The greatest number is : $largestNum")
}
fun add(){ // This is the function we will be calling in our main function
    var a = 5
    var b = 8
    println("The sum is: ${a+b}")

}
fun product(c: Int,d: Int): Int{
    return c*d
}
fun max(e: Int, f: Int): Int = if (e>f) e else f // One line function for ease of work