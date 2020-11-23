fun main(args:Array<String>){
    var son = Son("Roy","Indian")
}
open class Dad{
    var surname: String = ""
    constructor(surname: String){
        this.surname = surname
        println("The surname from Super class : $surname")
    }
}
class Son:Dad{
    var race:String =""
    constructor(surname: String,race: String): super(surname) {
        this.race = race
        println("The surname and race is: $surname and $race")
    }
}