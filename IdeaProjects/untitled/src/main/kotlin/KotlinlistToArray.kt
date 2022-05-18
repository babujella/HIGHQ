fun main(args:Array<String>){
    var array= listOf<Any>(1,2,3,"Babu","Raju","Venky")   //Creating an list And passing objects/Elements to it
    val changedToArray=array.toTypedArray()   //Converted that list to Array
    for (Elements in changedToArray){
        println(Elements)
    }
    println(changedToArray.count())
}