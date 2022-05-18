inline fun myFunction(fn:()->Unit){
    fn()
    println("hello")
}
fun main() {
    myFunction { println("Hiii") }
}