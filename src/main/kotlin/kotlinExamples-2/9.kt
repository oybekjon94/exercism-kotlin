package `kotlinExamples-2`

fun main(){
    val age = 17
    if (age >= 21){
        print("now you may drink in the US")
    }else if (age >= 18){
        println("you may vote now")
    }else if (age >= 16){
        println("you may drive now")
    }else{
        print("you're too young")
    }
}