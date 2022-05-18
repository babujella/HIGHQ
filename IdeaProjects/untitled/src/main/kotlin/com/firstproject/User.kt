package com.firstproject

import java.sql.DriverManager

data class User(val id:Int,val name:String){
}
fun main(){
    // create a database connection
    val jdbcUrl = "jdbc:mysql://localhost:3306/kotlin"
    // get the connection use the DriverManager.getConnection method.
    val connection=DriverManager.getConnection(jdbcUrl,"root","root")
    // prints true if the connection is valid
    println(connection.isValid(0))
    val query = connection.prepareStatement("SELECT * FROM kotlintable")
    val result = query.executeQuery()
    // an empty list for holding the results
    val users = mutableListOf<User>()
    while(result.next()) {
        // getting the value of the id column
        val id = result.getInt("id")
        // getting the value of the name column
        val name = result.getString("name")
       //constructing a User object and putting data into the list
        users.add(User(id, name))
    }
    println(users)
}
