import java.util.*
class SportsComplex {
}
fun main(args:Array<String>){
    var footballobj=FootBall()
    var badmintonobj=Badminton()
    var boxCricketobj=BoxCricket()
    while(true){
        println("continue press 0 otherwise press 1")
        val reader = Scanner(System.`in`)
        var option=reader.nextInt()
        if(option==1){
            println("Bye bro")
            break
        }
        else{
            println("Welcome to SportsComplex")
        }
        println("Enter your name")
        val name = readLine()!!
        println("Select your sport : 1-FootBall, 2-Cricket, 3-Badminton")
        var sportnumber=reader.nextInt()
        if(sportnumber==1){
            footballobj.footBallSlots()
            println("Enter ur Slot no")
            var slotnumber=reader.nextInt()
            footballobj.footBallSlotDetails(slotnumber)
        }
        else if(sportnumber==3){
            badmintonobj.badmintonSlots()
            println("Enter ur Slot no")
            var slotnumber=reader.nextInt()
            badmintonobj.badmintonSlotDetails(slotnumber)
        }
        else if (sportnumber==2){
            boxCricketobj.boxCricketSlots()
            println("Enter ur Slot no")
            var slotnumber=reader.nextInt()
            boxCricketobj.boxCricketSlotDetails(slotnumber)
        }
    }
}