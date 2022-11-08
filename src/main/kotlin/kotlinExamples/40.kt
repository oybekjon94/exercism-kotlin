package kotlinExamples

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

//Get Current date and time with pattern
fun main(){
    val current = LocalDateTime.now()

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
    val formatted = current.format(formatter)

    println("current Date and Time is : $formatted")
}