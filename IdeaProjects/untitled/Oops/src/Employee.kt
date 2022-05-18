open class Employee(id:Int,Name:String,Age:Int) {
    init {
        println("Employee id :$id and Name : $Name and age is :$Age")
    }
}
class WebDevoloper(id:Int,Name:String,Age:Int):Employee(id,Name,Age){
    fun functionality(){
        println("He is a WebDevoloper")
    }
}
class AndroidDevoloper(id:Int,Name:String,Age:Int):Employee(id,Name,Age){
    fun functionality(){
        println("He is a AndroidDevoloper")
    }
}
class IOSDevoloper(id:Int,Name:String,Age:Int):Employee(id,Name,Age){
    fun functionality(){
        println("He is a IOSDevoloper")
    }
}

fun main() {
    var WebDevoloperobj=WebDevoloper(18,"Raghu",22)
    WebDevoloperobj.functionality()
    var AndroidDevoloperobj=AndroidDevoloper(19,"Babu",21)
    AndroidDevoloperobj.functionality()
    var IOSDevoloperobj=IOSDevoloper(20,"Kailash",20)
    IOSDevoloperobj.functionality()
}
