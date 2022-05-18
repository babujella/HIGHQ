interface Interface {
    fun Runmethod(){
        println("Hello")
    }
    fun stopMethod()
}class SecondInterface:Interface{
    override fun stopMethod() {
        println("Hiii")
    }
}

fun main() {
    var obj=SecondInterface()
    obj.Runmethod()
    obj.stopMethod()
}