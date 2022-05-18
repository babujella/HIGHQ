import java.util.Scanner

fun main(args:Array<String>){
    val reader=Scanner(System.`in`)
    println("Enter your number")
    var number=reader.nextLong()
    for(i in 1..10){
        println("$number * $i = ${number*i}")
    }
}