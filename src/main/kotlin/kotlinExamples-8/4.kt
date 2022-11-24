package `kotlinExamples-8`

//this an examples of delegation
class Vehicle{
    fun print(){
        println("this is delegate")
    }
}
class Car{
    private val vehicle = Vehicle()
    fun printCar(){
        vehicle.print()
    }
}

fun main(){
    val car = Car()
    car.printCar()
}