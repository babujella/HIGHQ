import kotlin.math.E

fun main() {
    var immutableMap= mapOf<Int,Int>(1 to 2,2 to 3, 3 to 4,3 to 5,4 to 3)
  //  println(immutableMap)
    for (Elements in immutableMap)
        println("Key-Value pair is :$Elements")
}