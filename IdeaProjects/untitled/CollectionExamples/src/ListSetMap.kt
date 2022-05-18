import kotlin.math.E

class ListSetMap {
    /*Wite a Kotlin program to create read only data using List, Set and Map in example*/
}
fun main() {
    var set= setOf<String>("Babu","Raju","Naveen","Venky","Anji","Babu")       //Set
    for (names in set){
        println(names)
    }
/*    for(itr in set.iterator()){
        println(itr)
    }*/
    println()
    var List= listOf<String>("Babu","Raju","Naveen","Venky","Anji","Babu")        //List
    for(itr in List.listIterator())
        println(itr)
    println()
    for (Nam in List.iterator()){
        println(Nam)
    }
    println()
    var map= mapOf<String,Int>("Babu" to 6,"Raju" to 2,"Naveen" to 3,"Venky" to 4,"Anji" to 5,"Babu" to 1)
    for(mapElements in map.keys){
        println("$mapElements and ${map.get(mapElements)}")                     //Map
    }
    println()
    for (Elements in map){
        println(Elements)
    }

}