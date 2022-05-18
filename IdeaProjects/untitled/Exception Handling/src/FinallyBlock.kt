import java.util.*

fun main(args:Array<String>) {
    try {
        /*var reader = Scanner(System.`in`)
        println("Enter your 1st number :")
        var number1 = reader.nextInt()
        println("Enter your 2nd number :")
        var number2 = reader.nextInt()
        var result = number1 / number2
        if (result == 0) {
            println("Your answer is $result")
        }*/
        var array= arrayOf(1,2,3,4,5,6,7,8)
        var result=array[10]
        println(result)
    }
/*    catch (e:Exception){
        println("Exception is occured and Solved no Problem $e")

    }*/
    finally {
        println("The exception in the above try block and catch block is solved or not " +
                "It wll execute.............")
    }
}