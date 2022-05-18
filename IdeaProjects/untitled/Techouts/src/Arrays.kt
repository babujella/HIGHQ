fun main() {

    //Using arrayOf() function creating an array

    var FirstArray = arrayOf(1, 2, "BAbu", "Venky", 3, "Anji", 5, "RAju", "Naveen", 6)
    for (Objects in FirstArray) {
        println(Objects)
    }

    //Using arrayConstructor creating an array

    var ArrayConstructor = Array(5, { i -> i * 1 })
    for (i in 1..ArrayConstructor.size - 1) {
        println(ArrayConstructor[i])
    }
}