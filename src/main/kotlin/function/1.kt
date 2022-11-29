package function

import kotlin.math.pow

fun main(){
    val a = 4.0
    val b = 3.0
    val c = 5.5
    val d = 6
    powerA3(a)
    powerA3(b)
    powerA3(c)
    powerA3(d)
}
fun powerA3(number: Double){
    val result = number.pow(3)
    println(result)
}
fun powerA3(number: Int){
    val result = number*number*number
    println(result)
}