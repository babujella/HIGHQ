import java.sql.DriverManager
import java.sql.DriverManager.println

data class Bags(val number:Int, val name:String){

}

fun main() {
    val jdbcUrl = "jdbc:mysql://localhost:3306/cam"
    val connection=DriverManager.getConnection(jdbcUrl,"root","root")
    println(connection.isValid(0))
}
