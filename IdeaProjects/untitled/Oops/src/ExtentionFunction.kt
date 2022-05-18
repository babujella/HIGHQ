class ExtentionFunction {
    fun myMethod(Name:String,Id:Int){
        println("This is the method inside the class")
        println("$Name and $Id")
    }
}
fun ExtentionFunction.ismyNewMethod(Name:String,Id:Int){
    println("This is the method from outside the class")
    println("$Name and $Id")
}
fun ExtentionFunction.NewMethod(Name:String){
    println("Hello $Name")
}
fun main() {
    var ExtentionFunctionObj=ExtentionFunction()
    ExtentionFunctionObj.myMethod("Babu",1839)
    ExtentionFunctionObj.ismyNewMethod("Raghu",1849)
    ExtentionFunctionObj.NewMethod("Babu")
}