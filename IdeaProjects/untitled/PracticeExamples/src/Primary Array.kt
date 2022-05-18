fun main() {
    var array= Array(5 ,{i->i*1})
    for(i in 0..array.size-1){
        println(array[i])
    }
    println()
    var SecondArray=Array(10,{babu->babu*1})
    for (babu in 1.. SecondArray.size-1){
        println(SecondArray[babu])
    }

    println()
    var FirstArray= arrayOf(1,2,"BAbu","Venky",3,"Anji",5,"RAju","Naveen",6)
    for(Objects in FirstArray){
        println(Objects)
    }
    var ArrayConstructor=Array(5,{i->i*1})
    for(i in 1..ArrayConstructor.size-1){
        println(ArrayConstructor[i])
    }
}