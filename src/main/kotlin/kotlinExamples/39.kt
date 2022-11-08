package kotlinExamples

import java.time.LocalDate
import java.time.LocalDateTime

//Get Current date and time in default format
fun main(){
    val current = LocalDateTime.now()

    println("current date and time is: $current")
}