 data class DataClassEqualsandHashCode (var item: String, var price: Int){
}
fun main(agrs: Array<String>) {
    val p1 = DataClassEqualsandHashCode("laptop", 25000)
    val p2 = DataClassEqualsandHashCode("laptop", 25000)
    println(p1==p2)
    println(p1.equals(p2))
    println()
    println( p1.hashCode())
    println(p2.hashCode())
}
