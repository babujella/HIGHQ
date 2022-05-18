fun exampleofDefault(name:String="Babu",id:Int=1888){
    println("using Defalt arguments $name and $id")
}
fun examplePartial(name: String="Babu",id:Int=1223) {
    println("USing partial $name and $id")
}
fun exampleAll(name: String="Babu",id:Int=1223){
    println("USing allArguments $name and $id")
}
fun main() {
    var obj=exampleofDefault()
    var obj1=examplePartial("BABU")
    var obj2=exampleAll("Nani",1234)
}