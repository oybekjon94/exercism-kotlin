package kotlinExamples

//Generate Multiplication Table
//Generate Multiplication Table using for loop
fun main(){
    val num = 5
    for (i in 1..10){
        val product = num * i
        println("$num * $i = $product")
    }
}