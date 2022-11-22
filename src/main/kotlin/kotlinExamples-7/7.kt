package `kotlinExamples-7`

fun main(){
    //an example for immutable list
    val list = listOf(1,2,3,4,5,6)
    val listLanguage = listOf("English","Korean","Russian")

    for (item in listLanguage){
        println(item)
    }

    println(list.last())
    //output: 6
    println(list[3])
    //output: 4

}