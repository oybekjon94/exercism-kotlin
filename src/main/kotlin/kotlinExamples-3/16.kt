package `kotlinExamples-3`

//create uninitialized array
fun main(){
    var x = arrayOfNulls<Int>(10)
    for (a in x){
        println(a)
    }
}