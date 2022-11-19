package `kotlinExamples-6`

fun main(){
    val myArrayList: ArrayList<Double> = ArrayList()
    myArrayList.add(13.234434)
    myArrayList.add(12.234434)
    myArrayList.add(11.234434)
    myArrayList.add(11.234434)
    myArrayList.add(1.234434)
    var total = 0.0
    for (i in myArrayList){
        total += i
    }
    var average = total / myArrayList.size
    println("Average is "+ average)
}