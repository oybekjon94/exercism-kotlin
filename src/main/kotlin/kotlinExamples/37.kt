package kotlinExamples

fun main(){
    val ch = charArrayOf('a','e','i','o','u')

    val st = String(ch)
    val st2 = String(ch)

    println(st)
    println(st2)
}
/*
In the above program, we have a char array ch containing vowels. We use String's valueOf() method again to convert the character array to String
 */