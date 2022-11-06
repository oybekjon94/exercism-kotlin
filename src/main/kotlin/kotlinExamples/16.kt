package kotlinExamples

//Check Whether a Character is Alphabet or Not
//check alphabet using when
fun main(){
    val c = 'C'

    when{
        (c in 'a'..'z' || c in 'A'..'Z') -> println("$c is an alphabet")
        else -> println("$c is not ann alphabet")
    }
}