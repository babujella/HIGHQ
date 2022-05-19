abstract class Maark{
    abstract fun myMethodd(Id:Int,Name:String)
}
class SubMaark :Maark() {
    override fun myMethodd(Id: Int, Name: String) {
        println("$Id $Name")
    }
}
fun main() {
    var objj=SubMaark()
    objj.myMethodd(49,"Babu")
}