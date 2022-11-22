package `kotlinExamples-7`

fun main(){
    val set = hashSetOf(1,7,43)
    val list = arrayListOf(1,4,23)
    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}