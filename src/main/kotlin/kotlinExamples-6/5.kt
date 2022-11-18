package `kotlinExamples-6`

import kotlin.math.floor

fun main(){
    val stringList: List<String> = listOf(
        "denis","frank","michael","garry"
    )
    val mixedTypeList: List<Any> = listOf(
        "denis",31, 5, "BDay", 70.5, "weighs", "kg"
    )

    for (value in mixedTypeList){
        if (value is Int){
            println("Integer: '$value'")
        }else if (value is Double){
            println("Double: '$value' with Floor value ${floor(value)}")
        }else if (value is String){
            println("String: '$value' of length ${value.length}")
        }else{
            println("Unknown Type")
        }
    }


}