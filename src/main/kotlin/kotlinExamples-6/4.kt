package `kotlinExamples-6`

//Super Class, Parent Class, Base Class
open class Car3(val name:String, val brand: String){
   var range: Double = 0.0

   fun extendRange(amount: Double){
       if (amount > 0)
           range += amount
   }

    fun drive(distance:Double){
        println("Drove for $distance KM")
    }

}
//Sub Class Child Class or Derived class of Vehicle
class ElectricCar(name: String, brand: String, batterLife: Double)
    :Car3(name, brand){

}
fun main(){
    var audiaA3 = Car3("A3","Audi")
    var teslaS = ElectricCar("S-Model","Tesla",85.0)


    audiaA3.drive(200.0)
    teslaS.drive(200.0)
}