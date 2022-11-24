package `kotlinExamples-8`

// An example of lambda expression
fun main(){
    val display: (String, Int)-> String= {name, age -> "Hello my name is $name and my age is $age"}

    println(display("Oybek", 28))
}