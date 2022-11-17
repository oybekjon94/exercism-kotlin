package `kotlinExamples-4`

fun main(){
    var numberOne = 10
    var numberTwo = 11

    showResult(showMax(numberOne, numberTwo))
    showResult(showMin(numberOne, numberTwo))
}
fun showMax (n1: Int, n2: Int): Int = if (n1>n2) n1 else n2
fun showMin (n1: Int, n2: Int): Int = if (n1<n2) n2 else n1
fun showResult(int: Int){
    println(int)
}