fun main(args:Array<String>) {
    val mutable = mutableMapOf<Int, String>(1 to "Babu",2 to "Venky",3 to "Raju")
    val mutableKit = mutableMapOf<Int, String>(4 to "Shashi",5 to "Naveen",6 to "Anji")
    for (key in mutable.keys){
        println("$key ${mutable.get(key)}")
    }
    println()
    mutableKit.putAll(mutable)
    for (key in mutableKit.keys){
        println("$key = ${mutableKit.get(key)}")
    }
}