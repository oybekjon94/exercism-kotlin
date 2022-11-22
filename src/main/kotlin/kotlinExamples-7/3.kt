package `kotlinExamples-7`

fun main(){
    multiplicationTable(3)
}
fun multiplicationTable(size: Int){
    for (number in 1..size){
        print("| ")
        for (otherNumber in 1..size){
            print("$number x $otherNumber = ${number * otherNumber} | ")
        }
        println()
    }
}