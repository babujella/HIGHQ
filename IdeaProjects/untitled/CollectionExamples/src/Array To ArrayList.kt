class `Array To ArrayList` {

    /*WAP to Convert an Array to ArrayList in Java*/

}
fun main() {
    var array= arrayOf(1,2,3,4,5,6,7)                     //Array to ArrayList
    var arrayList= arrayListOf<Int>(*array)
    println(arrayList)
    println()
    var list= arrayListOf<Any>(1,2,3,"Babu")               //ArrayList to Array
    var arrayType=list.toTypedArray()
    for(Elements in arrayType)
        println(Elements)
}