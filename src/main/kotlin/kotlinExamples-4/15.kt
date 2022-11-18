package `kotlinExamples-4`

data class Item(var item: String, val status: Status){
    var itemResult: Any = when(status){
       Status.SUCCES -> println("Succes -> $item")
       Status.ERROR -> println("Error -> $item")
       Status.FAIL -> println("Fail -> $item")
       Status.LOADING -> println("Loading -> $item")
    }

}
enum class Status{
    SUCCES,
    ERROR,
    FAIL,
    LOADING,
}
//this enum class with constructor parameter
enum class ColorMode(val item: Int){
    //with constuctor arguments
    LIGHT(50),
    DARK(50)

}
fun main(){
    val item = Item("kotlin", Status.SUCCES)
    //output:
    //Succes -> kotlin
    println(item)
    //item(item= kotlin, status=SUCCESS
}