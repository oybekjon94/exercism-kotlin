package `kotlinExamples-7`

fun main(){
    val numbers = listOf(1,2,3,4,5,6)
    val result = findNumber(5, numbers)
    print(result)
}
fun findNumber(value: Int, numbers: List<Int>): Boolean{
    for (number in numbers){
        if (number == value){
            return true
        }
    }
    return false
}