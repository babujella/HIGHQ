import java.sql.DriverManager
import java.sql.DriverManager.println
data class Bags(val number:Int, val name:String){

}

fun main() {
    val jdbcUrl = "jdbc:mysql://localhost:3306/cam"
   // val connection= DriverManager.getConnection(jdbcUrl,"root","root")
    val connection=DriverManager.getConnection(jdbcUrl,"root","root")
    println(connection.isValid(0))
    val query = connection.prepareStatement("SELECT * FROM Bag")
    val result = query.executeQuery()
    val users =ArrayList<Bags>()
    while(result.next()) {
        val number = result.getInt("number")
        val name = result.getString("name")
        users.add(Bags(number, name))
    }
    println(users)
}
