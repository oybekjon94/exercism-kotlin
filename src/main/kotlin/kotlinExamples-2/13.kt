package `kotlinExamples-2`

fun main(){
    val age = 18
    when(age){
        in 21..150 -> println("now you may drink in the US ")
        in 18..20 -> println("you may vote now ")
        16,17 -> println("you may drive now")
        else -> println("you're too young")
    }
}