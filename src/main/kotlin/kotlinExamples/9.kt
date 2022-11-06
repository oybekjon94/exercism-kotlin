package kotlinExamples

/*
Check whether an alphabet is vowel or consonant using when statement
 */
fun main(){
    val ch = 'z'

    when(ch){
        'a','e','i','o','u' -> println("$ch is vowel")
        else -> println("$ch is consonant")
    }
}