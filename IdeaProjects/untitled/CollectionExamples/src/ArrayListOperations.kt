class ArrayListOperations {
}
/*perform followiing operations on array list
a)How to Iterate ArrayList using Java ListIterator
b)Arraylist add element at specific index
c)Sort ArrayList in descending order
e)sort arraylist of strings alphabetically java
f)Sort elements of Java ArrayList
g)replace an element at specified index arraylist
h)Search an element of Java ArrayList
i)Remove element from specified index ArrayList
*/

fun main() {
    var arraylist= arrayListOf<Int>(2,1,6,3,5,4)
    var StringArrayList= arrayListOf<String>("Raju","Venky","Babu","Anji","Naveen")
    for(itr in arraylist.listIterator()){
        println(itr)                   //Iterate ArrayList using Java ListIterator
    }
    println()
    arraylist.add(49)
    println(arraylist)             //Arraylist add element at specific index
    println()
    arraylist.sort()               //Sort ArrayList in descending order
    println(arraylist)
    println()
    println(StringArrayList)         //Sort ArrayList in descending order
    println()
    StringArrayList.sort()
    println(StringArrayList)         //sort arraylist of strings alphabetically java
    println()
    arraylist.set(6,33)               //replace an element at specified index arraylist
    println(arraylist)
    println()
    StringArrayList.set(3,"Shashi")           //replace an element at specified index arraylist
    println(StringArrayList)
    println()
    println(arraylist.get(3))                      //Search an element of Java ArrayList
    println()
    println(StringArrayList.get(3))              //Search an element of Java ArrayList
    println()
    arraylist.remove(2)                 //Remove element from specified index ArrayList
    println(arraylist)
    println()
    StringArrayList.remove("Shashi")            // Remove element from specified index ArrayList
    println(StringArrayList)
    StringArrayList.add("Raju")
    println(StringArrayList)
    println()
    StringArrayList.sort()
    println(StringArrayList)
}