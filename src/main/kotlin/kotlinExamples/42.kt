package kotlinExamples

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

//Get Current Date time in localized style
fun main(){
    val current = LocalDateTime.now()

    val formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
    val formatted = current.format(formatter)

    println("current date is :$formatted")
}
/*In the above program, we've used a Localized style
Medium to get the current date time in the given format.
There are other styles as well: Full, Long and Short.
 */