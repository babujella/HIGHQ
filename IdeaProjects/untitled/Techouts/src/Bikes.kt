class Bikes {
    var BikesSlots = hashMapOf<Int, String>(1 to "-Slot no", 2 to "-Slot no", 3 to "-Slot no", 4 to "-Slot no", 5 to "-Slot no", 6 to "-Slot no", 7 to "-Slot no", 8 to "-Slot no", 9 to "-Slot no", 10 to "-Slot no")
    fun BikesAvaialableSlots() {
        for(bikeslots in BikesSlots.keys){
            println("$bikeslots = ${BikesSlots.get(bikeslots)}")
        }
    }
    fun SlotsVerifying(slotNo: Int) {
        if(BikesSlots.containsKey(slotNo)){
            println("Succesfully Booked")
            BikesSlots.remove(slotNo)
        }else{
            println("The slot is already Booked choose wise")
        }
    }
}