class Cars {
    var CarsSlots = mutableMapOf<Int, String>(1 to "-Slot no", 2 to "-Slot no", 3 to "-Slot no", 4 to "-Slot no", 5 to "-Slot no", 6 to "-Slot no", 7 to "-Slot no", 8 to "-Slot no", 9 to "-Slot no", 10 to "-Slot no")
    fun CarsAvaialableSlots() {
        for(carsslots in CarsSlots.keys){
            println("$carsslots = ${CarsSlots.get(carsslots)}")
        }
    }
    fun SlotsVerifying(slotNo:Int){
        if(CarsSlots.containsKey(slotNo)){
            println("Succesfully Booked")
            CarsSlots.remove(slotNo)
        }else{
            println("The slot is already Booked choose wise")
        }
    }
}