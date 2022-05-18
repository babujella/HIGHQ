abstract class AbstractExample {
    abstract fun mymethod(name:String,id:Int)
}
class DerivedClass:AbstractExample() {
    override fun mymethod(name: String,id: Int) {
        println("You can implented here")
        println("$name $id")
    }
}

fun main() {
    var DerivedClassobj=DerivedClass()
    DerivedClassobj.mymethod("Babu",1839)

}
