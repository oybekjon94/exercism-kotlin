package kotlinExamples

//Check whether an alphabet is vowel or consonant using if..else statement
fun main(){
    val ch = 'i'
    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u') "vowel" else "consonant"
    println("$ch is $vowelConsonant")
}