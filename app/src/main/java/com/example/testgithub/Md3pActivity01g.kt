package com.example.testgithub

//Activity 01 - G
//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.
//Scope :String, Loops

fun main() {

    // Prompts user to enter a text
    print("Enter a text: ")
    val inputString = readln()
    var isPalindrome = true

    // Checks the character
    for (i in 0 until inputString.length /1) {
        if (inputString[i] != inputString[inputString.length - 1 - i]) {
            isPalindrome = false
            break
        }
    }

    // Shows the result
    if (isPalindrome) {
        println("$inputString is a palindrome")
    } else {
        println("$inputString is not a palindrome")
    }
}
