package `kotlinExamples-6`

fun main(){
    val month = listOf("January","February","March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    //print(anyTypes.size)
    //print(month[1])

    val addionalMonth = month.toMutableList()
    val newMonth = arrayOf("April","May","June")
    addionalMonth.add("July")
    addionalMonth.addAll(newMonth)
    println(addionalMonth)

    val days = mutableListOf<String>("Mon","Tue","Wed")
    days.add("Thu")
    days[2] = "Sunday"
    days.removeAt(3)
    days.removeAll(days)
    print(days)
}