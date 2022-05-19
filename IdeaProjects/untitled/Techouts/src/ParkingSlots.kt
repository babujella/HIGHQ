import java.util.*

/*
parking slots
1. there are two basements b1 and b2 both contains 30 slots
2. b1 for bikes and b2 for cars
3. allocate a vehicles with slots and generate a receipt and don't allocate a single slot for two vehicles
4. and store the data in a file*/
fun main() {
    var bikesobj=Bikes()
    var carsobj=Cars()
    while (true) {
        var reader = Scanner(System.`in`)
        println("If You want to continue press 1 or else press 2")
        var input = reader.nextInt()
        if (input == 2) {
            println("Thanks for Visiting our Parking")
            return
        } else {
            println("Welcome... to our Parking place")
        }
        println("Enter ur choice.. 1-Bike and 2-Car")
        var vehicleInput = reader.nextInt()
        if (vehicleInput == 1) {
            println("Go to Basement 1")
            bikesobj.BikesAvaialableSlots()
            println("Choose ur slot for Parking")
            var slotNo = reader.nextInt()
            bikesobj.SlotsVerifying(slotNo)
        }
        if(vehicleInput==2){
            println("Go to Basement 2")
            carsobj.CarsAvaialableSlots()
            println("Choose ur slot for Parking")
            var slotNo=reader.nextInt()
            carsobj.SlotsVerifying(slotNo)
        }
    }
}