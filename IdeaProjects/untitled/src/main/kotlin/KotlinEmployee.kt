class Employee(var Id:Int,var Name:String,var Role:String,var Company:String)
fun main(args:Array<String>){
    val arraylist=arrayListOf<Employee>()
    val e1=Employee(1839,"Babu","Devoloper","Techouts")
    val e2=Employee(1840,"Nagaraju","Devoloper","Techouts")
    val e3=Employee(1841,"Kailash","Devoloper","Techouts")
    val e4=Employee(1842,"Raghu","Devoloper","Techouts")
    arraylist.add(e1)
    arraylist.add(e2)
    arraylist.add(e3)
    arraylist.add(e4)
    for(e in arraylist){
        println("${e.Id} ${e.Name} ${e.Role} ${e.Company}")
        /*println(e.Id)
        println(e.Name)
        println(e.Role)
        println(e.Company)*/
    }
    /*var itr=arraylist.iterator()
    while(itr.hasNext()){
        println(itr.next())
    }*/
}
