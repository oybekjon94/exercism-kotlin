package `kotlinExamples-3`

//koltin array() constructor
fun main(){
    val x = Array<Int>(5){0}
    var y = Array(5, {i -> i*3})
    for (a in x){
        println(a)
    }
    for (b in y){
        println(b)
    }
}