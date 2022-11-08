package kotlinExamples

//Count Number of Digits in an Integer
fun main(){
    var count = 0
    var num = 1234567

    while (num !=0){
        num /= 10
        ++count
    }
    println("number if digits: $count")
}