package com.firstpackage

import java.sql.DriverManager

data class User(val id:Int,val name:String){

}
fun main() {
    val jdbcUrl = "jdbc:mysql://localhost:3306/kotlin"
    val connection= DriverManager.getConnection(jdbcUrl,"root","root")

}
