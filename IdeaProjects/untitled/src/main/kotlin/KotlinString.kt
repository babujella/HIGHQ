fun  main(args:Array<String>){
   /* val name:String="Babu"
    println(name)
    println()
    println("length of the string is:${name.length}")
    println()
    println(name.get(1))
    println()
    println(name.hashCode())
    println()
    println(name.toString())*/

    println()
    val names="Techouts \n is \n a \n Software \n company "       // Spring type-"Escaped String"-Double quotes
    println(names)

              //Raw String
                //Raw String provides new line and while it using it generates a "|" line
                // to avoid trimMargin function will be called
    println()
    val Elements="""Techouts                
        |is
        |a
        |Software
        |company
    """.trimMargin()           //Spring type-"Raw String"-Triple quotes
    println(Elements)           // trimMargin() function

    println()
    var strings1="Babu"
    var strings2="Babu"
    var strings3="Aishu"
    println(strings1==strings2)
    println(strings1===strings2)   //true
    println(strings1==strings2)    //true
    println(strings1===strings3)  //false
}