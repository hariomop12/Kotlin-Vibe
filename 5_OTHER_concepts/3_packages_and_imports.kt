// Packages and imports


// Packages are used to group related classes, functions, and other declarations together.

// Imports are used to make declarations from other packages accessible within your current file.

package com.example.models

class Person(val name: String, val age: Int) {
    // class implementation
}


import com.example.models.Person

fun main() {
    val person = Person("Hariom", 18)
    println("Name: ${person.name}, Age: ${person.age}")
}