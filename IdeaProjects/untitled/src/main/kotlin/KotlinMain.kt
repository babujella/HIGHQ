import java.util.*
fun main(args: Array<String>){

/* var Array=arrayOf("Babu","Venky","Anji")
     Array.set(0,"Raju")
    for(Elements in Array){
        println(Elements)*/

/*val text2 ="Hello, JavaTpoi\nt"
println(text2*/

/*
try {
    val data = 20 /0
}
catch(e:ArithmeticException){
    println(e)
}
println("The success code")*/


/*
    try {
        val data= arrayOf(2)
        data[3]=100/0
    }
    catch(e:Exception){
        println("Main Exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("ArrayIndexOutOfBoundsException is solved")
    }
    catch(e:ArithmeticException){
        println("Arithematic Exception is solved")
    }
*/

/*var str:String?="Hello"
var string=null
val len=
    if (str!=null){
        print(str.length)
    }
else{
    println("length is -1")
    }
println(str)
println(string)*/

/* var list= listOf<Int>(1,2,3,4,5)
for (Elements in list){
    println(Elements)
    for(index in 0..list.size-1){
    println(list[index])
    }
}*/


/*    var stringlist= listOf<String>("Babu","Raghu","Kailash","Ramesh")
    var nolist= listOf<Int>(1,2,3,4,5,6)
    var list= listOf<Any>(1,2,3,"Raju","Venky","Anji")
    println(stringlist.size)
    println(nolist.indexOf(4))
    println(list.drop(3))
        for(e in stringlist){
            println(e)
        }*/


/*var mutablelist= mutableListOf<Any>(1,2,3,"Babu","Raju")
var lists= mutableListOf(1,2,3,4,)
mutablelist.add(2,"Venky")
mutablelist.remove("Raju")
for(index in 0..mutablelist.size-1){
    println(mutablelist[index])
}
println(mutablelist[3])*/


/* var arraylist=ArrayList<String>()          ///create an empty arraylist
arraylist.add("Babu")                       //Adding objects to the arraylist....
arraylist.add("Venky")
for(function in arraylist){
    println(function)
}*/


/* var arraylist=ArrayList<Int>(3)    // create an ArrayList class with initialize its initial capacity
                                   //The capacity of ArrayList class is not fixed
                                   // and it can be change later in program according to requirement.
arraylist.add(1)
arraylist.add(2)
arraylist.add(3)
arraylist.add(4)
for(Elements in arraylist){
    println(Elements)
}*/


/* val arrayList: ArrayList<String> = ArrayList<String>()
var list: MutableList<String> = mutableListOf<String>()

list.add("Ajay")
list.add("Vijay")
list.add("Prakash")

arrayList.addAll(list)
println("......print ArrayList......")
val itr = arrayList.iterator()
while(itr.hasNext()) {
    println(itr.next())
}
println("size of arrayList = "+arrayList.size)*/


/*val num=ArrayList<Any>()
var mutablelist=mutableListOf<Any>(1,2,3,4,5,"Babu")
num.addAll(mutablelist)
val itr=num.iterator()                 //using iterator iterating the elements
while(itr.hasNext()){
    println(itr.next())
}*/


/*   val reader=Scanner(System.`in`)   //input reader Integer
print("Enter a number")
val num=reader.nextInt()
if(num%2==0){
    print("$num is even")
}
else{
    print("$num is odd")
}*/


/*var map=mapOf<Int,String>(1 to "Babu",2 to "Venky")        // using mapOf() interface
for(key in map.keys){
    println(" $key = ${map.get(key)}")
}
*/


/*println("Pleas enter the Name")                       //Input reader String
var name = readLine()!!
println("Name is : $name")*/

val scanner= Scanner(System.`in`)
println("Enter ur name :")
val name = readLine()!!
// println("$name")
println("Enter your age :")
val number = scanner.nextInt()
if (number % 2 == 0) {
    println("your name is $name Your eligible to vote")
} else {
    println("Sorry $name You are not eligible")
}
}