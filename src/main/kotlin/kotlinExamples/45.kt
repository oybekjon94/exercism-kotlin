package kotlinExamples

//66
//Convert array list to array
fun main(){
    // an arraylist of vowels
    val vowels_list: List<String> = listOf("a","e","i","o","u")

    //converting arraylist to array
    val vowels_array: Array<String> = vowels_list.toTypedArray()

    //printing elements of the array
    vowels_array.forEach { System.out.print(it) }

}
/*
we have defined an array list, vowels_list.
To convert the array list to an array, we have used the toTypedArray() method.
 */