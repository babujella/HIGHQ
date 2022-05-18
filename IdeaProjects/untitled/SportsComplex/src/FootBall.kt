open class FootBall {
    var footballmap= hashMapOf<Int,String>(1 to "9:00-9:30",2 to "9:30-10:00",3 to "10:00-10:30",4 to "10:30-11:00",5 to "11:00-11:30",6 to "11:30-12:00",7 to "12:00-12:30",8 to "12:30-1:00",9 to "1:00-1:30",10 to "1:30-2:00",11 to "2:00-2:30",12 to "2:30-3:00",13 to "3:00-3:30",14 to "3:30-4:00",15 to "4:00-4:30",16 to "4:30-5:00",17 to "5:00-5:30",18 to "5:30-6:00",19 to "6:00-6:30",20 to "6:30-7:00")
    fun footBallSlots(){
        for(key in footballmap.keys){
            println("$key = ${footballmap.get(key)}")
        }
    }
    fun footBallSlotDetails(slotnumber:Int){
        if(footballmap.containsKey(slotnumber)){
            println("Slot Succesfully Booked")
            footballmap.remove(slotnumber)
        }
        else{
            println("Slot is already Booked")
        }
    }
}
