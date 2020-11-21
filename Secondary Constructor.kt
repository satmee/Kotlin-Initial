fun main(args: Array<String>){
    var student = Student("Sathi",74)
    println(student.id)
}
class Student(var name: String){
    var id : Int = 0
    init {
        println("The name of the person passed is : $name and the id is $id")
    }
    constructor (n:String,id:Int): this(n){ // Secondary Constructor, it has it's own body
        //The body of the secondary constructor is called after init block
        this.id = id
    }
}