package `kotlinExamples-4`

fun main(){
    myFunction()
    //argument
    var result = addUp(5,6)
    println("result is "+ result)
}
//method - a method is a function within a class
//parameter (input)
fun addUp(a: Int, b:Int):Int{
    //output
    return a+b
}
fun myFunction(){
    println("called from myFunction")
}