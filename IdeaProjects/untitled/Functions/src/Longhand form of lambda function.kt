var arrayFunction= arrayOf(1,-1,4,2,-5,7,9,-3,0)
fun main() {
    var result=arrayFunction.filter { element -> element>=0 }
    println(result)
    println(result.sortedDescending())
}