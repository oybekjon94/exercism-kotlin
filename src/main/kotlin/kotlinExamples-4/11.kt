package `kotlinExamples-4`

enum class Color{
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLACK,
    INDIGO
}
fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "Yark"
        Color.GREEN -> "Battle"
        Color.BLACK -> "In"
        Color.INDIGO -> "Gave"
    }
fun main(){
    println(getMnemonic(Color.INDIGO))
}