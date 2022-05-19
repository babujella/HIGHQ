import com.sun.source.tree.LambdaExpressionTree

var LambdaExp ={ num1:Int, num2:Int->num1+num2}
var LambdaExpp:(Int,Int)->Int={number1,number2->number1*number2}
var LambdaExppr={numb1:Int,numb2:Int->
    var devide=numb2/numb1
    devide.toString()
}
fun main() {
    var LambdaExpObj=LambdaExp(3,6)
    var LambdaExppObj=LambdaExpp(4,9)
    var LambdaExpprObj=LambdaExppr(10,5)
    println(LambdaExpObj)
    println()
    println(LambdaExppObj)
    println()
    println(LambdaExpprObj)

}