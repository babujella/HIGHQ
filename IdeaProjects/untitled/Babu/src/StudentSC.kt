class StudentSC {
    var id:Int
    var name:String
    var branch:String
    constructor(StudentId:Int,StudentName:String,StudentBranch:String){
        this.id=StudentId
        this.name=StudentName
        this.branch=StudentBranch
        println("The Student name is $name and  id is $id Branch is $branch")
       // println("and  id is $id ")
        //println("Branch is $branch")
    }
}

fun main() {
    /*var st1=StudentSC(17,"Babu","Civil")
    var st2=StudentSC(18,"Venky","Mech")
    var st3=StudentSC(19,"Raju","CSE")*/
    StudentSC(17,"Babu","Civil")
    StudentSC(18,"Venky","Mech")
    StudentSC(19,"Raju","CSE")
}