class `Secondary Constructor` (num1:Int,num2:Int,num3:Int) {
    init {
    //    var sum=num1+num2+num3
       // println("Sum is $sum")
    }
    constructor(num1: Int,num2: Int) : this(num1,num2,7) {
      //  var multiplication=num1*num2
      //  println("Multiplication of two numbers is :$multiplication")
    }
}
fun main() {
    var obj=`Secondary Constructor`(2,4)
}