import java.util.*

fun main(args:Array<String>) {
    val reader = Scanner(System.`in`)
    println("Enter your number")
    var number = reader.nextInt()
    if(number%2==0){
        println("The number $number is Even")
    }
    else{
        println("The number $number is Odd")
    }

}