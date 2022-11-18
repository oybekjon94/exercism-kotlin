package `kotlinExamples-5`

fun compareAndPrint(e: Any){
    if (e is Int){
        println("the expression is $e")
    }
    if (e is String){
        println("the expression is $e")
    }
    if (e is Float){
        println("the expression is $e")
    }
}
fun main(){
    compareAndPrint("String")
}