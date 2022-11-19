package `kotlinExamples-6`

fun main(){
    val fruits = setOf("Orange","Apple","Grape","Apple")
    //print(fruits.size) -> output 3
    //print(fruits.toSortedSet()) -> Alphabet 순서

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    print(newFruits.elementAt(4))

}