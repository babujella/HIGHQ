open class TechMahindra(Name:String,Id:Int){
    init {
        println("$Id and Name is $Name")
    }
    open fun Working(){
        println("Paddu Working in TechMahindra")
        println("")
    }
}
abstract class TCS(Name: String, Id: Int) :TechMahindra(Name, Id){
    abstract override fun Working()
}
class TCSBranch(Name: String, Id: Int) :TCS(Name, Id){
    override fun Working(){
        println("Pasha Working in TCS")
    }
}

fun main() {
    var TechMahindraObj=TechMahindra("Paddu",1838)
    TechMahindraObj.Working()
    var TCSBranchObj=TCSBranch("Pasha",1839)
    TCSBranchObj.Working()
}



