fun Factorial(number:Int):Long{
    return if(number==1)
        number.toLong()

    else
        number*Factorial(number-1)
}
fun main() {
    var Techoutstobj=Factorial(5)
    println(Techoutstobj)

}