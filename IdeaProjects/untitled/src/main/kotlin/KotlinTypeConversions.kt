fun main(args:Array<String>){
    var number =100
    var floatNumber=number.toFloat()                 //Type casting int to Float
    print("The float number is :$floatNumber")
    println()
    var doubleNumber=number.toDouble()
    print("The double number is :$doubleNumber")          // Int to Double
    println()
    var boolean=number.toByte()                       //Int to Byte
    println(boolean)

    println()
    var numbers=180.98
    var intnumber=numbers.toInt()                   //float to Int
    println("The integer number is $intnumber")
    println()
    var floatNumbers=numbers.toFloat()
    print("The float number is :$floatNumbers")
}