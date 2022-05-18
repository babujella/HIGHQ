
fun main() {
    val Name1="Babu"
    var Name2="Aishu"
    var Name3="Babu"
    println(Name1==Name3)
    println(Name1===Name3)
    println()
    val EscapedString="Hello Techouts I am Babu\n I am eagerly Wait\ning to resign from \nthis company"
    println(EscapedString)
    println()
    val RawString="""Hello Techouts                    
        |I am Babu I am eagerly Waiting 
        |to resign
        |from
        |this
        |company""".trimMargin()
    println(RawString)
}