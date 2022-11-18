package `kotlinExamples-5`

class MobilePhone(osName: String, brand: String, model : String){
    init {
        println("My phone is $osName brand is $brand and model is $model")
    }
}
fun main(){
    var android = MobilePhone("Android","Samsunc","Galaxy S20 Ultra")
    val galaxyS20 = MobilePhone("Android","Samsunc","Galaxy S20")
    val mateXS = MobilePhone("Android","Huawei","Mate XS")
}