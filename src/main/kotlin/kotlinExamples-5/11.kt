package `kotlinExamples-5`

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader){
    val number = try {
        Integer.parseInt(reader.readLine())
    }catch (e: java.lang.NumberFormatException){
        null
    }
    println(number)
}

fun main(){
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)
}