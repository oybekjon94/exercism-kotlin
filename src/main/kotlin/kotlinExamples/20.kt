package kotlinExamples

import java.math.BigInteger

//Find Factorial of a Number
//Find Factorial of a number using BigInteger
fun main(){
    val num = 30
    var factorial = BigInteger.ONE
    for (i in 1..num){
        //factorial = fatorial * i
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
    }
    println("factorial of $num = $factorial")
}