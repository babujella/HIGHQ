
class InputOutPut {
}
fun main(args:Array<String>) {
    var reader= java.util.Scanner(System.`in`)
    println("Enter your number")
    var inputReader=reader.nextInt()
    println("You entered $inputReader")
    println("Enter your Name")
    var Name= readLine()!!
    println("Your name is :$Name")
    println("Enter your Location")
    var Location= readLine()!!
    println("U are from $Location")
    println()
    println("Hii $Name your number is $inputReader and you are from $Location")

}