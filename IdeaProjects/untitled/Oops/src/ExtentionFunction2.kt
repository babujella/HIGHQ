class ExtentionFunction2 {
    fun myMethod(marks:Int): Boolean {
        return marks> 45
    }
}
fun myNewMethod(marks: Int):Boolean{
    return marks>90
}
fun main() {
    var ExtentionFunctionsObj=ExtentionFunction2()
    println(ExtentionFunctionsObj.myMethod(34))
   // println(ExtentionFunctionsObj.)
}