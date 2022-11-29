package function

fun main(){
    println(calculateSumOfDigits(5855))
    println(calculateSumOfDigits(554))
    println(calculateSumOfDigits(985))
    println(calculateSumOfDigits(5255))
    println(calculateSumOfDigits(855))
}
fun calculateSumOfDigits(number: Int):Int{
    var num = number
    var sumOfDigits = 0
    while (num != 0){
        sumOfDigits += num % 10
        num /= 10
    }
    return sumOfDigits
}