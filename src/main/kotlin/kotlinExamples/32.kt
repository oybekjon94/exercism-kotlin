package kotlinExamples

import java.util.*

//Print a Multi-dimenstional Array
fun main(){
    val array = arrayOf(intArrayOf(1,2),
    intArrayOf(3,4),
        intArrayOf(5,6,7))

    println(Arrays.deepToString(array))
}