package array

fun main(){
    val array = IntArray(10)
    array[0] = 1
    for (index in 1 until array.size){
        array[index] = array[index - 1]*2
    }
    for ((index, item) in array.withIndex()){
        println("$index -> $item")
    }
}