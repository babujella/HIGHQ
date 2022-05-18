interface MyInterface {
    fun runMethod(){
        println("Helloo")
    }
    fun stopmethod()
}
class SecondInerface :MyInterface{
    fun stopmethod(){
        println("Helloo")
    }
}

fun main() {
    var obj=SecondInerface()
    obj.runMethod()
    obj.stopmethod()
}