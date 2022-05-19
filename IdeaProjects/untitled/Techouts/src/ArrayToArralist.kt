
/*
Wite a Java program to create read only data using List, Set and Map in example
Ques2. WAP to Convert an Array to ArrayList in Java .Use three ways for conversion and its vice versa.
*/
fun main() {
    var Integerlist= listOf<Int>(1,2,3,4,5,6,7,8)
    for (Elements in Integerlist){
        print(" $Elements")
    }
    println()
    var Stringlist = listOf<String>("Babu","Raju","Venky","Anji")
    for (Names in Stringlist){
        print(" $Names")
    }
    println()
    var arraylist= arrayListOf<Int>(1,2,3,4,5,6,7,8)
    var array=arraylist.toArray()
    //var array=arraylist.toTypedArray()
    for (numbers in array){
        print(" $numbers")
    }
    println()
    var namedArray= arrayOf<Any>(49,94,"Babu","Aishu")
    var aRraylist= arrayListOf<Any>(*namedArray)
    println(aRraylist)
}
