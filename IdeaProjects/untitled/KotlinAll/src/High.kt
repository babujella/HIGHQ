class High(Id:Int,Name:String) {
    init {
        println("$Id and name is $Name")
    }
}

fun main() {
    var highObj=High(49,"Babu")
}