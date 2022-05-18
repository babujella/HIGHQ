import java.util.*

fun main() {
    var reader= Scanner(System.`in`)
    println("Enter the year :")
    var inputReader=reader.nextInt()
    if(inputReader%4==0)
        println("It is a Leap Year")
    else
        println("It is not a leap year")
}