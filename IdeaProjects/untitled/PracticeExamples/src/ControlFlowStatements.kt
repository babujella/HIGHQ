import java.util.Scanner

fun main(args:Array<String>) {
//    A school has following rules for grading system:
//    a. Below 25 - F
//    b. 25 to 45 - E
//    c. 45 to 50 - D
//    d. 50 to 60 - C
//    e. 60 to 80 - B
//    f. Above 80 - A
//    Ask user to enter marks and print the corresponding grade.
    var reader=Scanner(System.`in`)
    println("Enter marks:")
    var marks=reader.nextInt()
    if(marks<=25){
        println("His grade is : 'F'")
    }
    else if(marks>=25 && marks<=45){
        println("His grade is : 'E'")
    }
    else if (marks>=45 && marks<=50){
        println("His grade is : 'D'")
    }
    else if(marks>=50 && marks<=60){
        println("His grade is : 'C'")
    }
    else if(marks>=60 && marks<=80){
        println("His grade is : 'B'")
    }
    else if(marks>=80 && marks<=100){
        println("His grade is : 'A'")
    }
}