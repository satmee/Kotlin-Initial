/***fun main(args: Array<String>){
    var person = Person()
    person.name = "Sathi"
    println("The name of the person passed is : ${person.name}")
}
class Person{
    var name ="xxxx"
}
 // Primary constructor using Property
fun main(args: Array<String>){
    var person = Person("Sathi") // Sathi is passed as a parameter here
}
class Person constructor(name: String) { // For calling the println from Class
    //var name = "xxxx"
    init {
        println("The name of the person passed is : $name")
    }
}*/
//Primary Constructor with Parameter
fun main(args: Array<String>){
    var person = Person("Sathi")

}
class Person(var name: String){
    init {
        println("The name of the person passed is : $name")
    }
}

