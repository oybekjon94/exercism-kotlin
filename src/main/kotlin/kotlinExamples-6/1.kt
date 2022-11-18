package `kotlinExamples-6`

fun main(){
    var myCar = Car()
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("MaxSpeed is ${myCar.maxSpeed}")

}
class Car(){
    lateinit var owner: String

    var myBrand: String = "BMW"
        //custom getter
    get(){
        return field.toLowerCase()
    }
    var maxSpeed: Int = 250
    get() = field
    set(value){
        field = value
    }

    init {
        owner = "Frank"
    }
}