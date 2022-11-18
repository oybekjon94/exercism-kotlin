package `kotlinExamples-5`

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int {
    if (e is Num){
        val number = e as Num
        return number.value
    }
    if (e is Sum){
        //the variable e is smart cast
        return eval(e.left) + eval(e.right)
    }
    throw java.lang.IllegalArgumentException("Unknown expression")
}
fun main(){
    println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))
    //expression is (1+2)+4
    //output is 7
}