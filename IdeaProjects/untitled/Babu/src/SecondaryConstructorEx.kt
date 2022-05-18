class SecondaryConstructorEx {

    constructor(number1:Int,number2:Int,number3: Int){
        var Total=number1+number2+number3            // This execute first bcz  in the below constructor
                                                    // we call this constructor
        println("Sum is $Total")
    }
    constructor(number1:Int,number2:Int) : this(number1,number2,7){
        var sum=number1+number2
        println("total is $sum")
    }
}
fun main() {
    SecondaryConstructorEx(2,8)
}