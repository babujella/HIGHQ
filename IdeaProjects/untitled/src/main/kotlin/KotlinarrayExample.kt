fun main(args:Array<String>){
   /* val firstarray= arrayOf(1,2,"Babu","Venky")    //Creating an array By using arrayOf() function
    for (Elements in firstarray){
        println(Elements)
    }*/

    val secondarray=Array(4 ,{i->i*1})      // Creating an array by using Constructor
   // val secondarray= arrayOf(1,2,"Babu","Venky")
    for(i in 0..secondarray.size-1){
        println(secondarray[i])
    }
    println()
    val array= arrayOf(1,2,"Babu","Venky","Raju")
    for (Elements in array){
        println("Using for loop $Elements")
    }
}