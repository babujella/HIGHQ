import java.util.*

fun main(args:Array<String>) {
    val reader = Scanner(System.`in`)
    println("Enter your number")
    var number = reader.nextInt()
    println("Your number is $number")

    println()
    println("Enter your first number")
    var number1=reader.nextInt()
    println("Enter your second number")
    var number2=reader.nextInt()
    val sum=number1+number2
    println(sum)

    
}