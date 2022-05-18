
fun main() {
    var Name:String?="Babu"
    println(Name)
    if(Name is String)
        println("Length is ${Name.length}")
    else
        println("It is Not string")

    println()
    var FullName:String?="Jella Babu"
    println(FullName)
    FullName=null
    if(FullName !is String)
        println("This is null")
    else
        println("Length is ${FullName.length}")
}