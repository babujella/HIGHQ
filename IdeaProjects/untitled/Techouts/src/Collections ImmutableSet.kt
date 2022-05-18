fun main() {
    var immutableSet= setOf<Any>(1,2,3,3,4,"Babu","Raju","Venky")
    for(i in immutableSet)
        println(i)
    println(immutableSet)
}