fun main() {
    var arrayExample=Array(5,{i->i*0})
    var arrayExample1= arrayOf(1,2,3,4,2,3,1,7,6)
    for (Elemnts in 0..arrayExample.size-1){
        println(Elemnts)
    }
    println()
    var NoDuplicates=arrayExample1.distinct()
    for(RealElements in NoDuplicates){
        println(RealElements)
    }
    println()
    println(NoDuplicates.count())
    println(arrayExample1.count())
}