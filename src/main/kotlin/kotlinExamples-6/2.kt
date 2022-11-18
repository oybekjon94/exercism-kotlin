package `kotlinExamples-6`

data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1,"oybek")

    val name = user1.name
    println(name)
    user1.name = "michael"
    val user2 = User(1,"michael")

    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name="Oybek Kholikov")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // print
    println(updatedUser.component2()) // prints Denis Panjuta

}