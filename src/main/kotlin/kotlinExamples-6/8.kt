package `kotlinExamples-6`

fun main(){
    val number = arrayOf(1,2,3,4,5,6)
    //print(number[0]) -> output 1
    print("initial values ${number.contentToString()}")
    number[0] = 6
    number[1] = 5
    number[4] = 2
    number[5] = 1
    print("\n final values ${number.contentToString()}")
}