// 1. What is an Extension Function?     
// An extension function allows you to add new functions to existing classes without modifying the original code of those classes.

// 2. Why Use Extension Functions?
    
// Enhance Functionality: Add useful methods to classes you don't own.
// Clean Code: Keep your code organized and modular by adding utility functions directly to the classes where they're most relevant.
// Readability: Make code more readable and intuitive by calling functions on the object they relate to.
// Simple Syntax:


// Here's how you can define and use an extension function:


// Define an extension function for the String class


fun String.addExclamation(): String {
    return this + "!" 
}
fun main() {
    val greeting = "Hello"
    // Use the extension function
    println(greeting.addExclamation()) // Output: Hello!
}


// Explanation:


// Define the Function:
// fun String.addExclamation(): This line defines an extension function called addExclamation() for the String class.
// Function Body:
// return this + "!": The function takes the current string (referred to as this) and adds an exclamation mark to it.
// Usage:
// After defining the function, you can call addExclamation() on any string object. For example, "Hello".addExclamation() adds an exclamation mark to "Hello", producing "Hello!".


// When to Use Extension Functions:

// 1. Utility Functions: When you frequently perform certain operations on a class and want to encapsulate that logic.

// 2. Library Classes: When you need to add functionality to classes from libraries or the Kotlin standard library, which you cannot modify.

// 3. Keep Code DRY: To avoid repeating the same code logic throughout your project.

// Example Use Case:
// Suppose you have a list of integers and you want to add a function that calculates the sum of all even numbers in the list:

// 1 st example 
// // Define an extension function for the List<Int> class
// fun List<Int>.sumOfEven(): Int {
//     return this.filter { it % 2 == 0 }.sum()
// }

// fun main() {
//     val numbers = listOf(1, 2, 3, 4, 5, 6)

//     // Use the extension function
//     println(numbers.sumOfEven()) // Output: 12 (2 + 4 + 6)
// }

// Explanation:
// fun List<Int>.sumOfEven(): Adds a new method to lists of integers.
// this.filter { it % 2 == 0 }.sum(): Filters the list to include only even numbers and sums them.
// Usage: You can now call sumOfEven() on any list of integers to quickly calculate the sum of even numbers.