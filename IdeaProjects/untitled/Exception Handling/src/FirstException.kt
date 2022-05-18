import java.util.Scanner

class FirstException {
}
fun main(args:Array<String>) {
    var reader=Scanner(System.`in`)
    println("Enter your 1st number :")
    var number1=reader.nextInt()
    println("Enter your 2nd number :")
    var number2=reader.nextInt()
    var result=number1/number2

    if(result%2==0){
        println("Your result is : $result")
    }
        else{
            try{
            throw Exception("Exception is solved")
        }
            catch (e:ArithmeticException){
                println(e)
            }
    }

}