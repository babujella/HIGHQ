class Demo (var name:String) {
    var id=2
    init {
        println("The name is $name ")
    }
    constructor(name: String,id:Int):this(name){    //Secondary Constructor and having its own body
        this.id = id
    }
}
fun main(args:Array<String>) {
    var demo=Demo("Jella Babu",10)
    println(demo.id)
  //  println(demo.name)
    //The body of the secondary construtor is called after the init block execution
}