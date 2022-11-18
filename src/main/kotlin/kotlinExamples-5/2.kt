package `kotlinExamples-5`

import java.lang.reflect.Executable

enum class SmartPhones{
    SAMSUNG,
    LG,
    IPHONE,
    REDMI,
    XIOME
}
fun compare(s1: SmartPhones, s2: SmartPhones) =
    when (setOf(s1, s2)){
        // setOf()
        // this function returns a new only set of given elements

        setOf(SmartPhones.LG, SmartPhones.REDMI), setOf(SmartPhones.REDMI, SmartPhones.LG) -> SmartPhones.LG
        setOf(SmartPhones.REDMI, SmartPhones.XIOME), setOf(SmartPhones.XIOME, SmartPhones.REDMI) -> SmartPhones.REDMI
        setOf(SmartPhones.SAMSUNG, SmartPhones.IPHONE) -> SmartPhones.IPHONE
        else -> throw Exception("Unknown")
    }
fun main(){
    println(compare(SmartPhones.SAMSUNG,SmartPhones.IPHONE))
    println(compare(SmartPhones.REDMI,SmartPhones.XIOME))
    println(compare(SmartPhones.XIOME,SmartPhones.REDMI))
}