package `kotlinExamples-3`

fun main(){
    for (i in 1 until 20){
        print("$i ")
        if(i/2 == 5){
            break
        }
    }
    println("done with the loop")
}