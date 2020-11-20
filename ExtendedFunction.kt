fun main(args:Array<String>){
    var availibility = milk()
    println("The status of availability of milk is:"+availibility.hasMilk(4))
    println("The status of getting FREE Toffees with milk:"+availibility.freeToffees(4))

}
fun milk.freeToffees(litre: Int):Boolean{
    return litre>7
}
class milk{
    fun hasMilk(litre:Int):Boolean{
        return litre<10
    }
}