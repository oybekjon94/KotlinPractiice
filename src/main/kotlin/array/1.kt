package array

fun main(){
    val array = intArrayOf(1,4,5,6,7,34,4,344,2,2)
    var min = 0
    for ((index, item) in array.withIndex()){
        if (item > array.first() && item < array.last()){
            min = index
        }
    }
    println(min)
}