package `kotlinExamples-7`

//Lambda  (expression) is a function which has no name
// Syntax: { variable(S) -> body_of_lambda}
fun main(){
    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a+b}
    println(sum(10,5))

    //even shorter
    val sum1 = {a:Int, b:Int -> println(a+b) }
    sum1(10,5)
}