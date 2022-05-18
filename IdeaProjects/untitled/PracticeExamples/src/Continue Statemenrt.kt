
fun main() {
    var Numbers = 1 ..10
    for(i in Numbers) {
        if (i == 4) {
            continue
        }
        println(i)
    }
    println()
    var Number = 1 ..10
    for(i in Number) {
        if (i == 4) {
            break
        }
        println(i)
    }

}