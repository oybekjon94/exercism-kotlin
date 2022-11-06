package kotlinExamples

//Find Factorial of a Number
//Find Factorial of a number using for loop
//factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
fun main(){
    val num = 3
    var factorial: Long = 1
    for (i in 1..num){
        //factorial  = factorial * i
        factorial *= i.toLong()
    }
    println("factorial of $num = $factorial")
}
