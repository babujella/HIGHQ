class Bikes {
    var hashmap= hashMapOf<Int,String>(1 to "SlotNo",2 to "SlotNo")
    fun BikesavailableSlots(){
        for (Elements in hashmap.keys)
            println("$Elements = ${hashmap.get(Elements)}")
    }
}

fun main() {
    var obj = Bikes()
    obj.BikesavailableSlots()


}