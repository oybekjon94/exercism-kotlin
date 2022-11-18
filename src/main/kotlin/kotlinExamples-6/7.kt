package `kotlinExamples-6`

fun main(){
    //val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
    //val numbers= intArrayOf(1,2,3,4,5,6)
    val numbers= arrayOf(1,2,3,4,5,6)
    //print(numbers.contentToString())  -> output [1, 2, 3, 4, 5, 6]
    for (element in numbers){
        //print(element) -> output 123456
        print("${element+2}") // -> output 345678
    }


}