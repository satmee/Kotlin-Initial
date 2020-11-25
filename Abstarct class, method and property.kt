fun main(args:Array<String>){
    var son = Son()
    println("The suranem is : ${son.surname}")
    println(son.getHeight())
}
abstract class Dad{       // To make a function inside a class to make abstact, the class needs to be abstract as well
    abstract var surname: String // Making a property abstract
    abstract fun getHeight() // Making a method abstract
    open fun Birthday(){
        var bday :Int = 5  // It must have a body
    }
    fun Education(){
        var edu : String ="Completed High school!"
    }
}
class Son:Dad(){
    override var surname: String = "Roy" // Abstract class, method and property should not be initialized now. not before
// The open function need not be overriden in the Derived class but abstarct class has to be overriden
    override fun getHeight() { // Same goes for here
        var height : Int = 6
        println("The height in feet is : $height")// Here comes it's body
    }
}
