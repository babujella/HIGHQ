class BabuSecondConstructor (Name:String,Id:Int) {
    init {
        println("$Name and $Id")
    }
    constructor(Name:String,Id:Int,Role:String):this(Name,Id){
        println("Name is $Name , Id is $Id , Role is $Role")
    }
}

fun main() {
    var BabuSecondConstructorObj=BabuSecondConstructor("Babu",49,"Devoloper")
}