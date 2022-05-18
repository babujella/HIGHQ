import java.util.Scanner

fun main(args:Array<String>) {
    var reader=Scanner(System.`in`)
    println("Enter your number :")
    var number=reader.nextInt()
    var floatNumber=number.toFloat()
    println("Float number is :$floatNumber")
    var longnumber=number.toLong()
    println("Long number is :$longnumber")
}