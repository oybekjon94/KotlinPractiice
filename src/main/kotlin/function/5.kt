package function

fun main(){
    val triangleSide = 5
    calculatePerimetrOfTriangle(triangleSide)
    val triangleSide2 = 6
    calculatePerimetrOfTriangle(triangleSide2)
    val triangleSide3 = 4
    calculatePerimetrOfTriangle(tomon = triangleSide3)
}
fun calculatePerimetrOfTriangle(tomon: Int){
    val p = tomon * 3
    println("Perimetr $p")
}