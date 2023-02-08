package com.example.testgithub

fun main() {
    var students = listOf("Chris", "Harry", "Joe", "Kash", "Lord", "Dickie")

    println("Class of Hogwarts")
    println("   ")
    println("Chris")
    println("Harry")
    println("Joe")
    println("Kash")
    println("Lord")
    println("Dickie")
    println("   ")

    var stringValue = ""
    while (stringValue != "exit") {
        println("Enter name to check the progress of each student (Type 'exit' to quit): ")
        stringValue = readln()

        if (stringValue in students) {
            when (stringValue) {
                "Chris" -> println("Progress is 95%")
                "Harry" -> println("Progress is 75%")
                "Joe" -> println("Progress is 85%")
                "Kash" -> println("Progress is 45%")
                "Lord" -> println("Progress is 75%")
                "Dickie" -> println("Progress is 85%")
            }
        } else if (stringValue != "exit") {
            println("No available data")
        }
    }
}
