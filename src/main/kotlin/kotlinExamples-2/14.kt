package `kotlinExamples-2`

fun main(){
    var x: Any = 13.37
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
}