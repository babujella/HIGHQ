import java.util.*

fun main() {
    var reader= Scanner(System.`in`)
    println("Enter number :")
    var inputReader=reader.nextInt()
    for(i in 1..10){
        println("$inputReader * $i = ${inputReader*i}")
    }
}