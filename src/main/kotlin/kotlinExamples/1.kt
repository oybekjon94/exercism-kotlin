package kotlinExamples

import java.util.*

/*
How to Print an Integer entered
by an user in Kotlin using Scanner
 */
fun main(){
    // Creates a reader instance which takes
    // input from standard input - keyboard
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    // println() prints the following line to the output screen
    println("You entered: $integer")
}