package function

fun main(){
    val number = 12432
    val digit = 7
    println(addDigitToRight(number = number, digit = digit))
}
fun addDigitToRight(number: Int, digit: Int): Int{
    return number*10+digit
}