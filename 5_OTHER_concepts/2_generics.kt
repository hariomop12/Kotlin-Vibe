// generics is a genral class that does not depend on class they have genral class pass the type of classs and use it .file


// Generics in Kotlin allow you to define classes, interfaces, and functions with type parameters. This enables you to create reusable components that can work with any type. Generics provide type safety and reduce code duplication by allowing you to write code that is agnostic to the specific types it operates on. Here's an explanation with a code example


// A generic class with a type parameter T

class Box<T>(val value: T) {
      fun getValue(): T {
          return value
      }
  }
  
  // A generic function that prints elements of a list
  fun <T> printList(list: List<T>) {
      for (element in list) {
          println(element)
      }
  }
  
  fun main() {
      // Creating a Box of Integers
      val intBox = Box(10)
      println("Value in intBox: ${intBox.getValue()}")
  
      // Creating a Box of Strings
      val stringBox = Box("Hello, Kotlin!")
      println("Value in stringBox: ${stringBox.getValue()}")
  
      // Using the printList function with different types
      val intList = listOf(1, 2, 3, 4, 5)
      val stringList = listOf("apple", "banana", "orange")
      
      println("Printing elements of intList:")
      printList(intList)
      
      println("Printing elements of stringList:")
      printList(stringList)
  }


  /*Explanation:

In the Box class, T is a type parameter that represents the type of value stored in the box. When creating an instance of Box, you specify the actual type (Int, String, etc.).
The getValue() function returns the value stored in the box, and its return type is T.
The printList function is a generic function that takes a List of any type T and prints its elements.
In the main function, we demonstrate the usage of the Box class with both Int and String types, and we use the printList function with lists of Int and String.
Generics allow you to write flexible and reusable code that can work with different types without sacrificing type safety. They enable you to create classes, functions, and interfaces that are parameterized by one or more types, providing flexibility and abstraction in your code. */