import java.util.Scanner

fun main(args:Array<String>) {
//    A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//    Take following input from user
//    Number of classes held
//            Number of classes attended.
//    And print
//            percentage of class attended
//    Is student is allowed to sit in exam or not.
//    Modify the above question to allow student to sit if he/she has medical cause.
//    Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

    var reader=Scanner(System.`in`)
    println("Enter the Number of classes held :")
    var classesHeld=reader.nextDouble()
    println("Enter the Number of classes attended :")
    var ClassesAttend=reader.nextDouble()
    println("if he/she has medical cause " +
            "if Yes- press 1" +
            "else press 0")
    var MedicalCause=reader.nextInt()
    var percentage=ClassesAttend/classesHeld *100
//    var percentage=percentag*100
    println(percentage)
    if(percentage<75 && MedicalCause==1)
        println("He/She allowed to write the Exam")
    else if(percentage>75)
        println("He/She allowed to write the Exam")

    else if(percentage<75)
        println("He/She Not allowed to write the Exam")

}