abstract class Techouts {
    abstract fun work()
    fun myFunction(){
        println("Enough to do")
    }
}
 class organization : Techouts(){
     override fun work() {
         println("Devoloping role")
     }
}

fun main() {
   var org= organization()
    org.work()
    org.myFunction()
}