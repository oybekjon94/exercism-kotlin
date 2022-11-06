package kotlinExamples

// Check Whether a Number is Positive or Negative
// using when expression
fun main(){
    val number = -12.2

    when{
        number < 0.0 -> println("$number is a negative number")
        number > 0.0 -> println("$number is a positive number")
        else -> println("$number is 0")
    }
}