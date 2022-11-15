package `kotlinExamples-2`

fun main(){
    val heightInCm: Int  = 170
    val heightFloat = heightInCm.toFloat()
    val heightInMeters = heightFloat/100
    println("$heightInCm sm = $heightInMeters")
    val intNumber = 10
    val floatNumber = intNumber.toFloat()
    val doubleNumber = intNumber.toDouble()
    val shortNumber = intNumber.toShort()
    val byteNumber = intNumber.toByte()
    val stringValue = intNumber.toString()

    println(floatNumber)
    println(doubleNumber)
    println(shortNumber)
    println(byteNumber)
    println(stringValue)
}