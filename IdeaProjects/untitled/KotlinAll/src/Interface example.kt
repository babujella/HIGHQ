interface  Babu{         // You cannot create instance for the interface
    var name:String          // properties in interface are abstract by default
    fun interfacemethod(num1:Int,num2:Int)
    fun normalMethod(number1:Int,number2:Int){
     //   var sum=number1+number2
       // println(sum)
    }
}
class Jella:Babu{
    override var name: String="Jella Babu"
    override fun interfacemethod(num1:Int,num2:Int) {
      //  var multiply=num1*num2
       //  println(multiply)
    }
}

fun main() {
    var obj=Jella()
    println(obj.name)
    obj.interfacemethod(4,5)
    obj.normalMethod(100,100)
}