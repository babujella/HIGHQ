fun main(args:Array<String>){
    var hashmap=HashMap<Int,String>()
    hashmap.put(1,"Babu")
    hashmap.put(2,"Venky")
    for(key in hashmap.keys){
        println("$key = ${hashmap.get(key)}")
    }
    println()
    var list=ArrayList(hashmap.keys)
    var listValues=ArrayList(hashmap.values)
    println("$list = $listValues")
}