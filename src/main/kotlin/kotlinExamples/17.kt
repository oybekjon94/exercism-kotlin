package kotlinExamples

//Calculate the Sum of Natural Numbers
//Sum of Natural Numbers using for loop
fun main(){
    val num  = 100
    var sum = 0

    for (i in 1..num){
        // sum = sum+i
        sum += i
    }
    println("sum = $sum")
}