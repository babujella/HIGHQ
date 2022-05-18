fun main() {
    var range=1..10
    for (i in range){
        print( " $i")
    }
    println()
    for (ranges in 'A'..'Z'){
        print(" $ranges")
    }
    println()
    for (a in 10 downTo 1){
        print(" $a")
    }
    println()
    for (b in 10 downTo 1 step 2){
        print(" $b")
    }
    println()
    for (c in 'A' until 'Q'){
        print(" $c")
    }
    println()
    var randed=1..5
    for (j in randed.reversed())
        println(j)
}