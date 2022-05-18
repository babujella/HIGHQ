fun addTwoNumbers(a:Int,b:Int,action:(Int,Int)->Int){
    var result=action(a,b)
    println(result)
}
fun main() {
//    var action:(Int,Int)->Int={x,y->x+y}
//    var obj= addTwoNumbers(2,4, action)

    // var obj=addTwoNumbers(2,4,{x,y->x+y})

  //  var obj=addTwoNumbers(2,4){x,y->x+y}

}