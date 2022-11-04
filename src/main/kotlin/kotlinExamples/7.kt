package kotlinExamples

import java.util.*

//Check whether a number is even or odd using if...else statement
fun main(){
    val reader = Scanner(System.`in`)

    print("enter a number: ")
    val num = reader.nextInt()

    if (num % 2 == 0)
        println("$num is even")
    else
        println("$num is odd")
}