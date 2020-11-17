import start.Person

fun main(args : Array<String>) {
    println("hehehee") /*println for '/n' func in kotlin */
    print("Yoooooo")
    println(10.0/9) /* to print float value, input should be in float value as well */
    var mynum =745
    println(mynum)
    var mystring : String /*Defining that this has to be a string value*/
    mystring = "Sathi"
    println(mystring)
    var personObj = Person()/* Creating object*/
    personObj.name = "Sunita"
    print("The name of the person is ${personObj.name}")
}

