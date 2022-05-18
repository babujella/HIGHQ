fun AllArguments(Name:String="Babu",Id:Int=1839,Role:String="Devoloper"){

    //default arguments in function name,Id,Role....

    println("Name of the employee :$Name")
    println("Id of the employee :$Id")
    println("Role of the employee :$Role")
}
fun main() {

    //Passing All Arguments(Only Name and Id) the role argument will be default.....

    var AllArgumentsObj=AllArguments("Aishu",1840,"HouseWife")
}