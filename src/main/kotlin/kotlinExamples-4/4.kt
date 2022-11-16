package `kotlinExamples-4`

fun main(){
    var avg = avg(3.3,4.4)
    print("result is $avg")
}
fun avg(a: Double, b: Double): Double{
    return (a+b)/2
}