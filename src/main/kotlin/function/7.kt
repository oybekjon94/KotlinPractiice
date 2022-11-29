package function

fun main(){
    val number = 124343
    invertDigit(son = number)
}
fun invertDigit(son: Int){
    var temp = son
    while (temp > 0){
        print(temp % 10)
        temp /= 10
    }
}