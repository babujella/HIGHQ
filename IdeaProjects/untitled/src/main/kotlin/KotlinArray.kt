fun main(args:Array<String>){
    val fruits = arrayOf("Apple", "Mango", "Banana", "Orange",1,2,4)   // creating an array of elemets
/*val array :Array<Int> = arrayOf<Int>(1,3,5,6)*/
    println(fruits[3] )
    println()
    for(fruitss in fruits){               //Loop through array
        println(fruitss)
    }
    println()
    //println(fruits.set(4,))              //Using set() method to set the value to particular index.
    println()
    for(fruitss in fruits){
        println(fruitss)
    }
    println()
    println(fruits.isEmpty())                 // checking the array is empty or Not
    println()
/*array.sortedArrayDescending()*/
    println()
    println(fruits.get(4))                       // Using get method to get element by using index
    println()
    val dumb=fruits.distinct()                   // using distinct() method to get values from array
                                                 // without duplicates
    for (i in dumb){
        println(i)
    }
    println()
    println("The size of the array ${fruits.count()}")
}