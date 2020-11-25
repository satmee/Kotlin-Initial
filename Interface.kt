fun main(args:Array<String>){
    var intf = Interface()
    intf.listen()
    intf.speak()
}
interface firstinterface{ // Interface supports both Abstract and Normal methods but by default all are Abstarct
    fun listen()    // Abstract Method
    fun speak(){    // Normal Methods are public and open but NOT Final!
        println("First interface is required to speak!")
    }
}
interface secondinterface{ // Our second interface
    fun listen(){   // Here it is Normal Method
        println("Second interface is required to listen!")
    }
    fun speak(){ // Here also it is Normal Method
        println("Second interface is required to speak!")
    }
}
class Interface : firstinterface,secondinterface{ // To call both the interfaces
    override fun listen() { //First one was abstract method, so it had to be overridden
        super.listen() // To call the Superior one
        println("First interface is required to listen!") // The value instantiated for second interface, abstract one
    }

    override fun speak() { /**Though both are normal methods but as they exist by same name, so system gets confused
                        and is required to override it as well!**/
        super<firstinterface>.speak() // For calling first interface
        super<secondinterface>.speak() // For calling second interface
    }
}