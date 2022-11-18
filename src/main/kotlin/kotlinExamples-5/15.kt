package `kotlinExamples-5`

class Person1(firstName: String = "denis", lastName: String = "peterson"){
    var age : Int? = null
    var hobby : String = "watch Netflix"

    //member secondary constructor
    constructor(firstName: String,lastName: String, age: Int)
            : this(firstName,lastName){
                this.age = age
            }

    // Member  functions - methods
    fun stateHobby(){
        println("my hobby is $hobby")
    }
}

fun main(){
    var oybek = Person1("oybek","kholikov", age = 31)
    oybek.hobby = "to skateboard"
    oybek.stateHobby()
    oybek.age = 28
    println("oybek is ${oybek.age} years old")

    var john = Person1()
    john.hobby = "play video games"
    john.stateHobby()
}