class Employee (EmployeeID:Int,EmployeeName:String,EmployeeRole:String) {
    init {
        println(EmployeeID)
        println(EmployeeName)
        println(EmployeeRole)
    }
}

fun main() {
    var obj=Employee(1839,"Jella Babu","Devoloper")
}