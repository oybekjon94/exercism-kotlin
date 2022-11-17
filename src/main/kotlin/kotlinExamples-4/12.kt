package `kotlinExamples-4`

fun main(){
    var nullableName : String? = "Oybek"
    //nullableName = null
    var len2 = nullableName?.length

    println(nullableName?.toLowerCase())
    /*
    if(nullableName != null){

        var len2 = nullableName

    }else{
        null
    }

     */
}