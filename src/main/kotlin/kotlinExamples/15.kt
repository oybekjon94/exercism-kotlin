package kotlinExamples

//Check Whether a Character is Alphabet or Not
//Check Alphabet using if else with ranges
fun main(){
    val c = 'a'

    if (c in 'a'..'z' || c in 'A'..'Z')
        println("$c is an alphabet")
    else
        println("$c is not an alphabet")
}