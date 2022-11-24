package `kotlinExamples-8`

import `kotlinExamples-7`.count

class LengthCounter{
    var counter: Int = 0
    //you cannot change this property outside the class
    private set
    fun addWord(word: String){
        counter += word.length
    }
}
fun main(){
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("hi")
    println(lengthCounter.counter)
}