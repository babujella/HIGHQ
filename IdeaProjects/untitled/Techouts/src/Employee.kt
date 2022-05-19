import java.util.Scanner

/*
WAP on custom exception where it gives an 'Invalid Employee ID' Exception while entering into an
Organization or office .
Create a pojo class that contains Employee details including name ,id ,address .
If ID is not found must give exception mesaage that "given Employee ID is not found or mismatched ,
please enter the valid ID" and if ID is found give message as "Welcome to office".
Take input from user and check the ID with the already existing Employee ids
Note: Please add multiple employee details
*/

class Employee(EmployeeName:String,EmployeeId:Int,EmployeeAdress:String){
    var EmployeeName:String
    var EmployeeId:Int
    var EmployeeAdress:String
    init {
        this.EmployeeName=EmployeeName
        this.EmployeeId=EmployeeId
        this.EmployeeAdress=EmployeeAdress
    }
}
fun main() {
    var EmployeeObj1=Employee("Babu J",1839,"Siddipet")
    var EmployeeObj2=Employee("Raghu K",1840,"Bheemavaram")
    var EmployeeObj3=Employee("Kailash Ch",1841,"Hyderabad")
    var arraylist= arrayListOf<Employee>()
    arraylist.add(EmployeeObj1)
    arraylist.add(EmployeeObj2)
    arraylist.add(EmployeeObj3)
    try {
        var reader=Scanner(System.`in`)
        println("Enter ur Id :")
        var inputId=reader.nextInt()
        for(id in arraylist) {
            if (id.EmployeeId == inputId) {
                println("Welcome to Office")
                return
            } else {
                throw Exception("Your id is Mismatched Sorry...")
            }
        }
    }
    catch (e:Exception){
        println(e)
    }
}