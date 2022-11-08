package kotlinExamples

import java.util.*

//58
//Concatenate Two Arrays using arraycopy
fun main(){
    val array1 = intArrayOf(1,2,3)
    val array2 = intArrayOf(4,5,6)

    val alen = array1.size
    val blen = array2.size
    val result = IntArray(alen + blen)

    System.arraycopy(array1, 0, result, 0, alen)
    System.arraycopy(array2, 0, result, alen, blen)

    println(Arrays.toString(result))
}