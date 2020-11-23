fun main(args:Array<String>){
    var son = Son("Roy","Indian")
}
open class Dad(var surname: String){
    init {
        println("The surnaame is : $surname")
    }
}
class Son(surname: String,var race:String){
    init {
        println("The surname and race is: $surname and $race")
    }
}