package `kotlinExamples-5`

fun main(){
    var denis = Person("oybek", "kholikov")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
}
class Person(firstName: String = "John", lastName: String = "Doe"){
    // Initializer block
    init {
        println("Initialed a new Person object with "+
        "firstName = $firstName and  lastName = $lastName")
    }
}