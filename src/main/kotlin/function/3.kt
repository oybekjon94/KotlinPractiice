package function

fun main(){
    val a = 5
    val b = 2
    val c = 10
    val d = 7
    var min = minOfTwoNumbers(a,b)
    min = minOfTwoNumbers(min,c)
    min = minOfTwoNumbers(min,d)
    println(min)
}
fun minOfTwoNumbers(a: Int, b:Int):Int{
    return if (a < b) a else b
}