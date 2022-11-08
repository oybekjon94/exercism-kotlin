package kotlinExamples

//Convert Character to String and Vice-Versa
//Convert char to String
fun main(){
    val ch = 'c'
    val st = Character.toString(ch)
    // Alternatively
    //st = String.valueOf(ch)

    println("the string is: $st")
}