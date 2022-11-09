package kotlinExamples

//65
//Join Two Lists using addAll()
fun main(){
    val list1 = ArrayList<String>()
    list1.add("a")

    val list2 = ArrayList<String>()
    list2.add("b")

    val joined = ArrayList<String>()

    joined.addAll(list1)
    joined.addAll(list2)

    println("list1: $list1")
    println("list1: $list2")
    println("list1: $joined")
}