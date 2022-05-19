open class India(pincode: Int, Capital:String) {
    init {
        println("Pincode of India is $pincode and Capital city of India is $Capital")
    }
    open fun IndiaMethod(){
        println("India is a country")
    }
}
class Telangana(pincode: Int, Capital: String, place:String): India(pincode, Capital){
    init {
        println("$pincode and $Capital and $place")
    }
    override fun IndiaMethod(){
        println("Telangana is a State in India")
    }
}

fun main() {
    var obj=Telangana(502276,"NewDelhi","Hyderabad")
    obj.IndiaMethod()
    }
