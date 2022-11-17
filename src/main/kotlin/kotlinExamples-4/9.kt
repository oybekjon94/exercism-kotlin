package `kotlinExamples-4`

fun main(args: Array<String>){
    val name = if (args.isNotEmpty()) args[0] else "kotlin"
    println("hello $name")

    val array = arrayOf("kotlin", "swift")

    if (array.isNotEmpty()) println("bye ${array[0]}")

    println("hello again! Elements of array is ${if (array.isNotEmpty()) array.size else "task is finished"}")
}