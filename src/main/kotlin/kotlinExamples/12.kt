package kotlinExamples

// Check Whether a Number is Positive or Negative
fun main(){
    val number = 12.3

    if(number < 0.0)
        println("$number is a negative number")
    else if (number > 0.0)
        println("$number is a positive number")
    else
        println("$number is 0")
}