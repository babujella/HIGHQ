fun main(args:Array<String>){
    var names= arrayOf("Babu","Raju","Venky","Naveen","Anji","Shashi")
    var number= listOf<Int>(1,2,3,4,5,6)
  //  var number= arrayOf(1,2,3,4,5,6)
    var index=0
    while (index<names.size){                    //While loop
        println(names[index])
        index++
    }
    println()
    for(Elements in names){              //For loop
        println(Elements)
    }
    println()
    for(numbers in number){
        if(numbers==4){
            continue                             // continue statement
           // break                              // break statements
        }
        println(numbers)
    }

}