package kotlinExamples

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

//Get Current Date time using predefined constants
fun main(){
    val current = LocalDateTime.now()

    val formatter = DateTimeFormatter.BASIC_ISO_DATE
    val formatted = current.format(formatter)

    println("current date is : $formatted")
}
//we've used a predefined format constant BASIC_ISO_DATE to get the current ISO date as the output