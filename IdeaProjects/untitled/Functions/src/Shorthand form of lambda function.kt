var array= arrayOf(1,-1,4,2,-5,7,9,-3,0)


var names= arrayOf("Babu","Raju","Aishu","venky","Lucky","Anji")
fun main() {
    var Filter=array.filter { it>0 }
    var namesFilter=names.filter { it> names.contains("Babu").toString() }
    println(Filter)
    println(namesFilter)
}
