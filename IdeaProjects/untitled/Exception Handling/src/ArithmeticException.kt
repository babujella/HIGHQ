fun main(args:Array<String>) {
    var number1=10
    var number2=0
    try {
        var total=number1/number2
        println(total)
    }
    catch (e:ArithmeticException){
        println("Exception is solved  $e")
    }
}
