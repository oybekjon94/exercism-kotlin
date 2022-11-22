package `kotlinExamples-7`

//declares a top-level property
var count = 0
fun main(){
    println(increase())
    println("$count")
}
fun increase(){
    //count++
    //count = 0 ->count = 1(when you call again)
    count++
}