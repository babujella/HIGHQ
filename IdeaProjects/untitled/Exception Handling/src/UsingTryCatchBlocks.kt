import java.io.FileWriter

fun main(args:Array<String>) {
    try {
        var num=100/0
    }
    catch (e:ArithmeticException){
        println(e)
    }
}