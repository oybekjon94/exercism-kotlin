package `kotlinExamples-6`

//Creating an empty arraylist
//Adding an object in arraylist
fun main(){
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println("....print ArrayList....")
    for (i in arrayList){
        println(i)
    }
}