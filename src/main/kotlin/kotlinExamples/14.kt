package kotlinExamples

//Check Whether a Character is Alphabet or Not
//Check Alphabet using if else
fun main(){
    val c = '*'

    if(c >= 'a' && c <= 'z' || c >= 'A' && c<= 'Z')
        println("$c is an alphabet")
    else
        println("$c is not an alphabet")
}