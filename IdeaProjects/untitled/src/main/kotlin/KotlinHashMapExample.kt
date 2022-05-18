fun main(args:Array<String>){
    var hashMap= hashMapOf<Int,String>(1 to "Babu",2 to "Venky",3 to "Saveen",3 to "Raju",3 to "Kohli",4 to "Anji",)
    for(item in hashMap.keys){
        println("$item = ${hashMap.get(item)}")
    }
    println()
    var arrylist= arrayListOf<Int>(1,2,3,4,5,6,7)
    for (items in arrylist){
        println(items)
    }
    println()
    var hashset= hashSetOf<Int>(4,8,9,5,4,6)
    for (i in hashset){
        println(i)
    }
    println(hashset)
    println()
    var mutablesetof= mutableSetOf<String>("Babu","Venky","Raju","Anji")
    var mutablesetof1= mutableSetOf<Int>(1,8,7,6,9,3,6,7)
    for (j in mutablesetof){
        println(j)
    }
    println(mutablesetof)
    println(mutablesetof1)
}