open class Techouts(Id:Int, Name:String) {
    init {
        println("$Id $Name")
    }
}
class Tcs(Id: Int) :Techouts(Id,"Babu"){
    init {
        println(Id)
    }
    fun myMethod(){
        println("Hello Babu")
    }
}

fun main() {
    var objj=Tcs(49)
    objj.myMethod()
}