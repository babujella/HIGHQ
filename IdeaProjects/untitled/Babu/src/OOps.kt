open class OOps (id:Int,name:String) {
    init {
        println(id)
        println(name)
    }
    fun myMethod(){
        println("Super class")
    }
}
class child(id:Int,name:String):OOps(id,name){
    fun display(){
        println("Child class")
    }
}

fun main() {
    var childclassobj=child(1,"Babu")
    childclassobj.myMethod()
    childclassobj.display()
}