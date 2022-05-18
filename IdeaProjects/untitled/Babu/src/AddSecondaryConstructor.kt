
class AddSecondaryConstructor {
    constructor(number1:Int,number2:Int){
        var Total=number1+number2
        println(Total)
    }
    constructor(num1:Int,num2:Int,num3:Int){
        var Total = num1+num2-num3
        println(Total)
    }
}
fun main() {
    AddSecondaryConstructor(1,7)
    AddSecondaryConstructor(2,7,5,)
}