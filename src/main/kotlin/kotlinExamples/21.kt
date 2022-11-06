package kotlinExamples

//Find Factorial of a Number
//Find Factorial of a number using while loop
fun main(){
    val num = 5
    var i = 1
    var factorial: Long = 1
    while (i <= num){
        factorial *= i.toLong()
        i++
    }
    println("factorial of $num = $factorial")
}