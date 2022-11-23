package `kotlinExamples-7`

interface ClickableWithDefault{
    fun click()
    fun showOff() = println("I'm clickable")
}

class ButtonWithDefault: ClickableWithDefault{
    override fun click() {
    }
    override fun showOff() {
        super.showOff()
    }
}

fun main(){
    ButtonWithDefault().showOff()
}