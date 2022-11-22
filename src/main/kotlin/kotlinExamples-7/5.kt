package `kotlinExamples-7`

fun recognize(c: Char) = when(c){
    in 'a'..'z' -> "it's a character"
    in '0'..'9' -> "it's a digit"
    else -> "I don't know"
}
fun main(){
    println(recognize('r'))
}