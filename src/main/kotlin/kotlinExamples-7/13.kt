package `kotlinExamples-7`

fun main(){
    Button1().click()
}
interface Clickable{
    //this declares an interface with a single method named click
    fun click()
}
class Button1: Clickable{
    override fun click() {
        println("Button clicked")
    }
}
