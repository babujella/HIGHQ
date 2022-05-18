class Badminton {
    var badmintonmap= hashMapOf<Int,String>(1 to "9:00-10:00",2 to "10:00 - 11:00",3 to "11:00 - 12:00",4 to "12:00-01:00",5 to "01:00-02:00",6 to "02:00-03:00",7 to "03:00-04:00",8 to "04:00-05:00",9 to "05:00-06:00",10 to "06:00-07:00")
    fun badmintonSlots(){
        for(key in badmintonmap.keys){
            println("$key = ${badmintonmap.get(key)}")
        }
    }
    fun badmintonSlotDetails(slotnumber:Int){
        if(badmintonmap.containsKey(slotnumber)){
            println("Slot Succesfully Booked")
            badmintonmap.remove(slotnumber)
        }
        else{
            println("Slot is already Booked")
        }
    }
}