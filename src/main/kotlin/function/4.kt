package function

import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    val a = 4.0
    val b = 3.0
    val c = findHyp(a,b)
    findAndPrintPerimeter(a,b,c)
}
fun findHyp(a: Double, b:Double):Double{
    return sqrt(a.pow(2)+b.pow(2))
}
fun findAndPrintPerimeter(a:Double, b:Double,c:Double){
    println(a+b+c)
}