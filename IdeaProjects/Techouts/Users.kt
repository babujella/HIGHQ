import java.sql.DriverManager
import java.sql.DriverManager.println

// create a model class{}{}{}{}{}{}{}{}{}{}{}
data class User(val id:Int, val name:String){

}
fun main() {
    //To create a database connection we need a JDBC URL
    val jdbcUrl = "jdbc:mysql://localhost:3306/kotlin"
    // get the connection and to create a connection we need DriverManager.getConnection method.
    val connection= DriverManager.getConnection(jdbcUrl,"root","root")
    // prints true if the connection is valid
    println(connection.isValid(0))
  /*  To execute a SELECT query using the connection we need to,

  1.Prepare a SQL statement
  2.Execute the statement.
  3.Iterate through the ResultSet and retrieve values with methods such as getInt or getString*/
    val query = connection.prepareStatement("SELECT * FROM kotlintable")
    // the query is executed and results are fetched
    val result = query.executeQuery()
    // an empty list for holding the results
    val users =ArrayList<User>()
    while(result.next()) {
        // getting the value of the id column
        val id = result.getInt("id")
        // getting the value of the name column
        val name = result.getString("name")
        /*
       constructing a User object and
       putting data into the list
        */
        users.add(User(id, name))
    }
    println(users)
}
