fun main(args:Array<String>){
    val hashMap:HashMap<Int,String> = HashMap<Int,String>()  //Creating an empty HashMap
    hashMap.put(1,"Babu")                                    //Ading key and values to the map
    hashMap.put(2,"venky")
    hashMap.put(3,"Raju")
    for (key in hashMap.keys){
        println("Key :$key     value :${hashMap.get(key)}")
    }
    println(hashMap.size)        //Size of the hashmap by size() method....
    println()
    println(hashMap.get(1))           //using get() method by passing index number as parameter get value
    println()
    println(hashMap.remove(2))    //removing the value by using remove method passing index
    println()
    for (key in hashMap.keys){
        println("$key=${hashMap.get(key)}")
    }
    println()
    hashMap.put(2,"Venky")                        //adding element to the map
    if(hashMap.size>2){
        println("Succesfully Added")
        for (key in hashMap.keys){
            println("$key=${hashMap.get(key)}")
        }
    }
    else{
        println("Could not be added")
    }
    println(hashMap.contains(4))
    println()
    println(hashMap.keys)                  // getting keys from the map
    println()
    println(hashMap.values)              //getting values from hashmap


}