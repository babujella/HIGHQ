var sum={a:Int,b:Int->a+b}                          //One way    It is like Type Inference
var LambdaExpression:(Int,Int)->Int={x,y->x+y}       //Anthor way

//We don’t always require a variable because it can be passed directly as an argument to a function.
var function={num1:Int,num2:Int->
    var sum=num1+num2
    sum.toString()}
/*Kotlin compiler self evaluate it as a function which takes two integer values and returns String.
      (Int,Int) -> String*/

var numbers:(Int,Int)->Int={x,y->x+y}

fun main() {
    var objl=numbers(4,6)
    var sumobj=sum(3,4)
    var obj=LambdaExpression(7,9)
    val obj1=LambdaExpression(5,99)
    var obbb=function(4,6)
    println(objl)
    println(sumobj)
    println(obj1)
    println(obbb)
    println(obj)

}