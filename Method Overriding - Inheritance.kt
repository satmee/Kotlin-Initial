fun main(args:Array<String>){
    var toffees = Toffees()
    var milkShake = MilkShake()
    println(toffees.amount) // Printing the overridden value
    println(milkShake.amount) // printing the super class value

}
open class Desserts{ // This is the Parent class
    open var amount:Int = 0 // This is the value that would be overridden by child Class Toffees
    var flavor:String =""
}
class Toffees:Desserts(){

    override var amount:Int = 8 // Using 'override' keyword to apply override function, make sure parent class has it's var or fun open
        // super.amount /** In case we want to print the super class's value before and then print the overriden value
    
    var withJelly:Boolean = true
}
class MilkShake:Desserts(){
    var sprinkles:Boolean = true
}