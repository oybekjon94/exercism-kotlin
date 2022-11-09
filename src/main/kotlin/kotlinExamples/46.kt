package kotlinExamples

//Convert array to array list
fun main(){
    // vowels array
    val vowels_array: Array<String> = arrayOf("a","e","i","o","u")

    //converting array to array list
    val vowels_list: List<String> = vowels_array.toList()

    //printing elements of the array list
    vowels_list.forEach { System.out.print(it) }

}
//To convert an array to an array list, we have used the toList() method.