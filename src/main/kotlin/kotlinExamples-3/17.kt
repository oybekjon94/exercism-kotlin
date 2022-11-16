package `kotlinExamples-3`

//array append element
fun main(){
    val arr = arrayOf(22,12,12)
    val x = arr.plus(50)
    for (e in x){
        println(e)
    }
}