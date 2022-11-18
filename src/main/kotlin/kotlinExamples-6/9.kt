package `kotlinExamples-6`

fun main(){
    val days = arrayOf("Sun","Mon","Tues","Wed","Thurs","Fri","Sat","Sun")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple",2.5), Fruit("Grape",3.5))
    //println(fruits.contentToString())
    for (fruit in fruits){
        print(" ${fruit.name}")
    }

    for (index in fruits.indices){
        print("${fruits[index].name} is in index $index")
    }

}
data class Fruit(val name: String, val price: Double)