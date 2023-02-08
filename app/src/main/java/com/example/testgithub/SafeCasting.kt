package com.example.testgithub

fun main () {
    var str1: Any = "Hello Kotlin!"
    val str2: String? = str1 as? String

    str1 = 11
    val str3: String? = str1 as? String
    val str4: Int? = str1 as? Int

    println(str2)
    println(str3)
    println(str4)
}