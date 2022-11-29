package array

fun main(){
    val array = intArrayOf(2,2,2,2,2,3,4,4,4,4,4,5)

    var index = 0
    while (index < array.size){
        var count = 1
        for (innerIndex in index+1 until array.size){
            if (array[index] == array[innerIndex]) {
                count++

            }else{
                break
            }
        }
        println(count)
        index+=count
    }
}