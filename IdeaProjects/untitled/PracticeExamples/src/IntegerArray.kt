fun main() {
    var Numbers= arrayOf(1,2,3,4,5,6,7,8,9,10)
    for(i in Numbers){
        println(i)
    }
    println()
    println( "The size of the array :${Numbers.size}")
    println()
    println("Value at the index 0 is :${Numbers.get(0)}")
    println()
    println(Numbers.isEmpty())
    println()
    println(Numbers.indices)
    println()
    println(Numbers.hashCode())
}