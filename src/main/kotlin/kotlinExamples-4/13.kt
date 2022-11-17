package `kotlinExamples-4`

fun main(){
    var nullableName: String? = "Oybek"
    //nullableName = null

    //  ?: Elvis operator
    val name = nullableName ?: "Guest"
    //println("name is $name")

    println(nullableName!!.toLowerCase())
}