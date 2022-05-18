fun main() {
    var names= arrayOf("Babu","Raju","Venky","Naveen","Anji","Shashi","Ashok","Srikanth")
    var index=0
    for (i in names)
        println(i)
    println()
    while (index<names.size) {
        println(names[index])
        index++
    }
}