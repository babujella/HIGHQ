fun main() {
    var str="Hi I am Babu and am from Techouts"
    if (str is String){    // No Explicit Casting needed.  
        println(str.length)
    }
    else{
        println("This is not string")
    }
}