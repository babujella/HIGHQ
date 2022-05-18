abstract class Bank {
    abstract fun intrest(p:Int,r:Int,t:Int) :Int
}
class SBI:Bank(){
    override fun intrest(p: Int, r: Int, t: Int): Int {
        return (p*r*t)/100
    }
}
class Canara:Bank(){
    override fun intrest(p: Int, r: Int, t: Int): Int {
        return (p*r*t)/100
    }
}
class ICICI:Bank(){
    override fun intrest(p: Int, r: Int, t: Int): Int {
        return (p*r*t)/100
    }
}

fun main(args:Array<String>) {
    var sBIobj=SBI()
    sBIobj.intrest(1000,2,3)
    println("SBI intrest is :$sBIobj")
    var canaraObj=Canara()
    canaraObj.intrest(2000,3,6)
    println("Canara intrest is :$canaraObj")
    var ICICIObj=ICICI()
    ICICIObj.intrest(8000,2,5)
    println("ICICI intrest is :$ICICIObj")
}