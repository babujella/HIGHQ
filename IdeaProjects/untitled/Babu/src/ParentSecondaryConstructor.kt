open class ParentChildSConstructor {
    constructor(EmployeeId :Int,EmployeeName:String,EmployeeRole:String){
        println(EmployeeId)
        println(EmployeeName)
        println(EmployeeRole)
    }
}
class ChildConstructor: ParentChildSConstructor{
    constructor(EmployeeId :Int,EmployeeName:String):super(EmployeeId,EmployeeName,"Devoloper"){
        println()
        println(EmployeeId)
        println(EmployeeName)
    }
}

fun main() {
    ChildConstructor(1839,"BabuJella")
}