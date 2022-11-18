package `kotlinExamples-6`

//smart cast
fun main(){
    val obj1: Any = "I have a dream"
    if (obj1 !is String){
        println("Not a String")
    }else{
        //obj is automatically cast to a String in this scope
        println("Found a String of length ${obj1.length}")
    }

    //Explicit (unsafe) casting using the "as" keyword - can go wrong
    val str1: String = obj1 as String
    println(str1.length)

    /*
    val obj2: Any = 1337
    val str2: String = obj2 as String
    println(str2)
    // it's error output
     */

    //explicit (safe) casting using the "as?" keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String // works
    println(str3) // prints null

}