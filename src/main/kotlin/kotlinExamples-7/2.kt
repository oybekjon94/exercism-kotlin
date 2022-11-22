package `kotlinExamples-7`

fun checkFirst(values: List<String>): String{
    return if(values.firstOrNull() != null){
        values.first()
    }else{
        "No values"
    }
}

fun checkFirstOrNull(values: List<String>): String? {
    return if (values.firstOrNull() != null){
        values.first()
    }else{
        null
    }
}

fun main(){
    val names = listOf("Oybek")
    val emptyNames = emptyList<String>()

    println(checkFirst(names))
    println(checkFirstOrNull(emptyNames))
}