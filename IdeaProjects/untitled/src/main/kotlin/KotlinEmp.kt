class Emp(var Id:Int,var Name:String,var Role:String,var Company:String) {
}
    fun main(args: Array<String>) {
        val arraylist = arrayListOf<Emp>()
        val e1 = Emp(1839, "Babu", "Devoloper", "Techouts")
        val e2 = Emp(1840, "Nagaraju", "Devoloper", "Techouts")
        val e3 = Emp(1841, "Kailash", "Devoloper", "Techouts")
        val e4 = Emp(1842, "Raghu", "Devoloper", "Techouts")
        arraylist.add(e1)
        arraylist.add(e2)
        arraylist.add(e3)
        arraylist.add(e4)
        for (e in arraylist){
            println("${e.Id} ${e.Name} ${e.Role} ${e.Company}")

    }
}
