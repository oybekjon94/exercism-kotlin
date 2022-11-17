package `kotlinExamples-4`

fun main(){
    val person = Person("kotlin")
    println(person.name)

    person.name = "swift"
    println(person.name)
}

class Person(var name: String)