//fun main() {
//    val student1 = "Vic Recopuerto Amable"
//    val student2 = "John Chris Bolanio"
//    val student3 = "Andrew Bustos"
//    val student4 = "Rizwan Caser"
//    val student5 = "Condino Mark Andrei"
//    val student6 = "Laurence De Dios"
//    val student7 = "Jerome Elenzano"
//    val student8 = "ZR Lopez"
//    val student9 = "Ryan Malacao"
//    val student0 = "Gretchen Roque"
//
//    val students = listOf(student1, student2, student3, student4, student5, student6, student7, student8, student9, student0)
//
//    println("Enter student number to update result:")
//    for (i in 0 until students.size) {
//        println("$i - ${students[i]}")
//    }
//    println("-1 - Exit")
//
//    while (true) {
//        val studentNumber = readLine()!!.toInt()
//        if (studentNumber == -1) {
//            break
//        } else if (studentNumber >= 0 && studentNumber < students.size) {
//            val student = students[studentNumber]
//            print("Enter result for $student: ")
//            val result = readLine()!!.toUpperCase()
//            if (result == "PASS") {
//                println("$student passed.")
//            } else if (result == "FAIL") {
//                println("$student failed.")
//            } else {
//                println("Invalid input.")
//            }
//        } else {
//            println("Invalid student number.")
//        }
//    }
//}
