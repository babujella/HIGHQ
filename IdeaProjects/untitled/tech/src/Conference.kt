interface Conference {
    fun conferencemethod(id:Int,name:String)
}
class ConferenceRoom:Conference{
    override fun conferencemethod(id: Int, name: String) {
        println("$id $name")
    }
}

fun main() {
    var objj=ConferenceRoom()
    objj.conferencemethod(1839,"BabuJella")
}