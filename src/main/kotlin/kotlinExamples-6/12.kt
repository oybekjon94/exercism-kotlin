package `kotlinExamples-6`

fun main(){
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    //print(daysOfTheWeek[2]) -> output Tuesday

    for (key in daysOfTheWeek.keys){
        //print("$key is to ${daysOfTheWeek[key]}")
    }
    val fruits = mapOf("Favorite" to Fruit("Grape", 2.5),
        "OK" to Fruit("Apple", 3.5))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    print(newDaysOfWeek.toSortedMap())
}

data class Fruit2(val name:String, val price: Double)