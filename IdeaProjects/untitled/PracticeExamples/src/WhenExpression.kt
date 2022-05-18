import java.util.Scanner
import javax.naming.Name

fun main(args:Array<String>) {
    var reader=Scanner(System.`in`)
    println("Enter the Day ")
    var Name=reader.next()
    when(Name){
        "Sunday" -> println("Today is Sunday")
        "Monday" -> println("Today is Monday")
        "Tuesday" -> println("Today is Tuesday")
        "Wednesday" -> println("Today is Wednesday")
        "Thursday" -> println("Today is Thursday")
        "Friday" -> println("Today is Friday")
        "Saturday" -> println("Today is Saturday")
        else -> println("I don't know  the Day Sorry.......")

    }
}