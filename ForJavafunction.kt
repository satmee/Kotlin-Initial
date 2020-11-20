/** For knowing Interopearbility Function of Kotlin, refer to JavaFunction.java file**/
fun main(args:Array<String>) {
    var area = JavaFunction.getArea(8,42) // Function called from Kotlin into our Java File
    println("The area of the rectangle printed from Java File : $area")

}
fun add(a:Int,b:Int):Int{ // Function called from Java File into Kotlin
    return a+b
}
// Java File does not have Default values option, so to call default value from Kotlin to your Kotlin file, add @JvmOverload just above your function which you want to call
