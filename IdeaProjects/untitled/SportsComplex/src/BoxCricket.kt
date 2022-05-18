class BoxCricket {
    var boxcricketmap= hashMapOf<Int,String>(1 to "1:00-3:00",2 to "3:00-5:00",3 to "5:00-7:00",4 to "7:00-9:00",5 to "9:00-11:00")
    fun boxCricketSlots(){
        for(key in boxcricketmap.keys){
            println("$key = ${boxcricketmap.get(key)}")
        }
    }
    fun boxCricketSlotDetails(slotnumber:Int){
        if(boxcricketmap.containsKey(slotnumber)){
            println("Slot Succesfully Booked")
            boxcricketmap.remove(slotnumber)
        }
        else{
            println("Slot is already Booked")
        }
    }
}