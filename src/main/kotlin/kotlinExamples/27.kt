package kotlinExamples

//Reverse a number in Kotlin
fun main(){
    var num = 1234
    var reversed = 0

    while (num != 0){
        val digit = num % 10
        reversed = reversed * 10 +digit
        num /= 10
    }
    println("reversed number: $reversed")

}
