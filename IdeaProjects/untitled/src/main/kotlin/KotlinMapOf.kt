


fun main(args:Array<String>){
    val map=mapOf(1 to "babu",2 to "Venky",3 to "Raju",4 to "Anji")

    for(key in map.keys){
        println("The elements in the key of $key = ${map.get(key)}")
    }
    println(map.getValue(2))
    println(map.isEmpty())

    for(itr in map.asIterable()){
        println("Key :${itr.key} and value:${itr.value}")
    }
    println("Poo raaaaa")
    for(itrr in map.iterator()){
        println("${itrr.key} and ${itrr.value}")
    }
    println()

}
/*
fun main(args: Array<String>){

    val myMap = mapOf(1 to "Ajay", 4 to "Vijay", 3 to "Prakash","ram" to "Ram", "two" to 2)
    for(key in myMap.keys){
        println("Element at key $key = ${myMap.get(key)}")
    }
}  */
