package `kotlinExamples-3`

fun main(){
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if (roomTemp >= 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }
}