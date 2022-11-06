package kotlinExamples

//Calculate the Sum of Natural Numbers
// sum of natural numbers using while loop
fun main(){
    val num = 50
    var i = 1
    var sum = 0

    while (i <= num){
        sum += i
        i++
    }
    println("sum = $sum")
}