package kotlinExamples

/*
Find Largest Among three numbers using if..else statement
 */
fun main(){
    val n1 = -4.5
    val n2 = 3.9
    val n3 = 2.5

    if (n1 >= n2 && n1>=n3)
        println("$n1 is the largest number")
    else if (n2 >= n1 && n2 >= n3)
        println("$n2 is the largest number")
    else
        println("$n3 is the largest number")
}