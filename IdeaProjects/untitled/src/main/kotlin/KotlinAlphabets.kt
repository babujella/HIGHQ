import java.util.*

fun main(args:Array<String>) {
    val reader = Scanner(System.`in`)
    println("Enter your 1st  number")
    var number1=reader.nextInt()
    println("Enter your 2nd  number")
    var number2=reader.nextInt()
    println("Enter your 3rd  number")
    var number3=reader.nextInt()

    if (number1>number2 && number1>number3){
        println("$number1 is the greatest number")
    }
    else if (number2>number1 && number2>number3){
        println(" $number2 is the biggest number")
    }
    else{
        println("$number3 is the biggest number")
    }

}