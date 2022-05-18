class Employee (empid:Int,empName:String) {
    var id:Int
    var name:String
    init {
        this.id=empid
        this.name=empName
        println("The employee Id is $id")
        println("The employee name is $name")
    }
}

fun main() {
    var emp=Employee(1839,"BabuJella")
}