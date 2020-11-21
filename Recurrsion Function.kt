import java.math.BigInteger
// Finding the Fibonacci Series number at n-th position using tailrec function
fun main(args: Array<String>){
    println(fibbonaciSeries(986,BigInteger("1"),BigInteger("0")))
}
tailrec fun fibbonaciSeries(n:Int, a1:BigInteger, a2:BigInteger):BigInteger { //tailrec function used for recurssion of function and stops stack overflowing
    if(n == 0)
        return a2
    else
        return fibbonaciSeries(n-1,a1+a2,a1)
}
