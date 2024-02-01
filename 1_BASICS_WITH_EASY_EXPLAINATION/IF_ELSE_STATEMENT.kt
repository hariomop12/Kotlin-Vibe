// Certainly! In Kotlin, the `if-else` statement is used for conditional branching. It allows you to execute different code blocks based on whether a given condition is true or false. Here's a breakdown of how it works:



// ### Basic Syntax:

//  kotlin
// if (condition) {
//     // Code to be executed if the condition is true
// } else {
//     // Code to be executed if the condition is false
// }


// ### Example:


// fun main() {
//     val number = 10

//     if (number > 0) {
//         println("The number is positive")
//     } else {
//         println("The number is non-positive")
//     }
// }







// In this example, if the `number` is greater than 0, the code block inside the first set of braces will be executed; otherwise, the code block inside the `else` braces will be executed.




// ### Expressions:

// In Kotlin, `if-else` is an expression, meaning it returns a value. This is different from many other languages where `if-else` is a statement. For example:

 
// val result = if (number > 0) {
//     "Positive"
// } else {
//     "Non-positive"
// }

// println("The number is $result")
 

// Here, the `if-else` expression is used to assign a value to the variable `result`.









// ### Multiple Conditions:

// You can also chain multiple conditions using `else if`:

//  fun main() {
//     val number = 0

//     if (number > 0) {
//         println("The number is positive")
//     } else if (number < 0) {
//         println("The number is negative")
//     } else {
//         println("The number is zero")
//     }
// }
 


// ### Using `when` for More Complex Conditions:

// For more complex scenarios, Kotlin provides the `when` expression, which is similar to a `switch` statement in other languages.

 fun main() {
    val number = 10

    when {
        number > 0 -> println("Positive")
        number < 0 -> println("Negative")
        else -> println("Zero")
    }
}
 

// This is an overview of the `if-else` statement in Kotlin. It allows you to make decisions in your code based on certain conditions, providing flexibility in program flow.