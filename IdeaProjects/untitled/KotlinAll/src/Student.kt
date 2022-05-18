class Student(StudentId:Int,StudentName:String,StudentCollege:String) {
    init {
        println("Student Id number is :$StudentId Student Name is :$StudentName and He is from $StudentCollege")
    }
}

fun main() {
    var obj=Student(185,"Jella Babu","Mallareddy Engineering College")
}