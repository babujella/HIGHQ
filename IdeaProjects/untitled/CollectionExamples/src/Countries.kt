class Countries {
}
   /*WAP to map multiple countries with their respective capitals using map .Iterating them using
   1.foreach loop
   2.keyset iterator
   3.entryset iterator along with foreach
4.EntrySet along with Java iterator*/
fun main() {
    var countrymap= hashMapOf<String,String>("India" to "NewDelhi","Afghanistan" to "Kabul","Albania" to "Tirana")
       for(iterating in countrymap.iterator())
           println(iterating)
       println()
}