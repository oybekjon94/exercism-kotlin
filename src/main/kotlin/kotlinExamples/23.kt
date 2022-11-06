package kotlinExamples

//Generate Multiplication Table
//generate multiplication table using while loop
fun main(){
    val num = 9
    var i = 1
    while (i <= 10){
        val product = num * i
        println("$num * $i = $product")
        i++ // i = i + 1
    }
}