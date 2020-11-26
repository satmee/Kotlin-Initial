/** Every Super class also has a class which is uperior than them as well
 * and that is class "Any"!
 * "Any" class has functions like -
 * 1) equals():Boolean
 * 2) hashCode():Int
 * 3) toString():String**/
fun main(arg:Array<String>){

    var student1 = Students(name = "Sathi", Id = 12)
    var student2 = Students(name = "Sathi", Id = 12)
    println(student1)
    // To compare
    if(student1==student2) /**If you remove the 'data' keyword from class, student1 and student2 will be reffered as
     two reference points, thus they will ouput you "Not equal", when you use data,
     the values stored are compared! **/
    {
        println("They are equal!")
    }
    else
        println("They are not equal!")
    //To override the existing property
    var newStudents = student1.copy(name = "Zeenat")
    println(newStudents)
}
data class Students(var name:String, var Id:Int){

}