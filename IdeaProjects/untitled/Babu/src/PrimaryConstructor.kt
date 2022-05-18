class Students constructor( var name:String) {         //Primary constructor
   // var name="BAbu"
    init {                                  // The init block will execute after the instance of class is created
      //  this.name=name
        println("The name is $name")
    }
}
fun main(args:Array<String>) {
    var student=Students("Babu Jella")            //Instance/Object is created for class Students..
}