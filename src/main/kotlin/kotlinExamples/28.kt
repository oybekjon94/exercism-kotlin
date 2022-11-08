package kotlinExamples

// Calculate power of a number without using pow()
fun main(){
    val base = 3
    var exponent = 4
    var result: Long = 1

    while (exponent != 0){
        result *= base.toLong()
        --exponent
    }
    println("answer = $result")
}
/*
Using the while loop, we keep on multiplying result by base until exponent becomes zero.

In this case, we multiply result by base 4 times in total, so result = 1 * 3 * 3 * 3 * 3 = 81.
We also need to cast base to Long because result only accepts Long and Kotlin focuses on type safety.
 */