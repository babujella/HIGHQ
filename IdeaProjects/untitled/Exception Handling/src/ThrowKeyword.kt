fun main(args:Array<String>) {
    println("Enter your name :")
    var name:String= readLine()!!
    println("Enter your password :")
    var password:String= readLine()!!
    if(password.length<5){
        throw  ArithmeticException("Password is short for our reqirements")
    }
    else{
        println("You are logged in with" +
                "$name and ur password is $password(please keep it as Private)")
    }
}