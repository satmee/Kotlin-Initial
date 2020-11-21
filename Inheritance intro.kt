// By default classes in Kotlin are "public" and "final", so t access classes we have keyword known as "open"
fun main(args:Array<String>){
    var candies = Candies()
    candies.amount = 4
    candies.flavor = "Chocolate"
    candies.withJelly = true
    println("Amount of candy: ${candies.amount}")
    println("Flavour of the candy chosen: ${candies.flavor}")
    println("Need the jelly one? ${candies.withJelly}")

    println("------------------")

    var iceCream = IceCream()
    iceCream.amount = 7
    iceCream.sprinkles = false
    iceCream.flavor = "Vanilla"
    println("Amount of ice cream cup(s): ${iceCream.amount}")
    println("Flavour of the ice cream chosen: ${iceCream.flavor}")
    println("Need with sprinkles? ${iceCream.sprinkles}")

    var sweets = sweets()
    sweets.flavor ="Default"
    sweets.amount = 0
}
open class sweets{ // This is the Parent class, also usage of "open"
    var amount:Int = 0
    var flavor:String =""
}
class Candies:sweets(){             // Candies and IceCream are the Child class inheriting it's functions from sweet class
    var withJelly:Boolean = true
}
class IceCream:sweets(){
    var sprinkles:Boolean = true
}
