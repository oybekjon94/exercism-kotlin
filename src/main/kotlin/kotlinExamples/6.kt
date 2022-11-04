package kotlinExamples

//Swap two numbers using temporary variable
fun main(){
    var first = 1.20f
    var second = 2.45f

    println("--Before swap--")
    println("first number = $first")
    println("second number = $second")

    // Value of first is assigned to temporary
    val temporary = first

    // Value of second is assigned to first
    first = second

    // Value of temporary
    // (which contains the initial value of first) is assigned to second
    second = temporary

    println("--After swap--")
    println("first number = $first")
    println("second number = $second")
}