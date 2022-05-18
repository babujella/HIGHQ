fun main() {
    val str:String?="Babu"
    val obj:String?=str as? String
    println(obj)

    val name:String?="Jella Babu"
    val changedName: Int? =name as? Int?
    println(changedName)
}