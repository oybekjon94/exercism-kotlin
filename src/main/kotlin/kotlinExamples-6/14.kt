package `kotlinExamples-6`

fun main(){
    val arrayList: ArrayList<String> = ArrayList<String>(5)
    var list:MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayList.addAll(list)

    println("....print ArrayList....")

    val itr = arrayList.iterator()

    while (itr.hasNext()){
        println(itr.next())
    }
    println("size of arrayList="+arrayList.size)
}