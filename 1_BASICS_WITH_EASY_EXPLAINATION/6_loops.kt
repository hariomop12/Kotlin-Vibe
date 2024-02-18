// loops in kotlin

// loops are used to execute a block of code repeatedly until a given condition is true and it run one time if the condition is false only if the loop is do while loop otherwise it will not run if the condition is false

 
// there are total 4 types of loops in kotlin
// 1. for loop
// 2. while loop
// 3. do while loop
// 4. forEach loop


// 1 for loop

// The for loop in Kotlin is used to iterate over a range of values.
// In this example, the loop iterates over the range 1..5, which includes the numbers from 1 to 5.
// Inside the loop, the variable i takes on each value in the specified range, and the square of i is calculated and printed.
// The loop will execute the block of code for each value in the specified range.

// eg:
// fun main() {
//     // Example for loop in Kotlin
//     for (i in 1..5) {
//         val square = i * i
//         println("The square of $i is $square")
//     }
// }
 

 
//  2 while loop
// while loop is used to execute a block of code repeatedly until a given condition is true and it run one time if the condition is false

// syntax of while loop
// while(condition){
//     // code to be executed
// }

// example of while loop

// fun main() {
//     var i = 1                // Declare and initialize a variable `i` with a value of 1
//     while (i <= 10) {        // Start a while loop, which will execute the block of code inside as long as the condition `i <= 10` is true
//         println(i)           // Print the current value of `i` to the console
//         i++                  // Increment the value of `i` by 1
//     }
// }
 

// Explanation:

// 1. `fun main() { ... }`: This is the entry point of the Kotlin program. The code inside this function will be executed when the program starts running.

// 2. `var i = 1`: This declares a variable named `i` and initializes it with a value of 1. The `var` keyword indicates that `i` is mutable, meaning its value can be changed later in the code.

// 3. `while (i <= 10) { ... }`: This is a while loop. It repeatedly executes the block of code inside (enclosed within curly braces `{}`) as long as the condition `i <= 10` is true. In this case, the loop will continue executing as long as the value of `i` is less than or equal to 10.

// 4. `println(i)`: Inside the while loop, this statement prints the current value of `i` to the console. 

// 5. `i++`: This is shorthand for `i = i + 1`. It increments the value of `i` by 1 in each iteration of the loop. This ensures that the loop will eventually terminate when `i` becomes greater than 10, preventing an infinite loop.

// Overall, this code prints the numbers from 1 to 10, each on a new line, by using a while loop and incrementing the value of a variable `i` in each iteration.



//  3 do while loop
// do while loop is used to execute a block of code repeatedly until a given condition is true and it run one time if the condition is false

// This Kotlin code demonstrates the usage of a `do-while` loop to print numbers from 1 to 5. Let's break down the code:

 
// fun main() {
//     var i = 1  // Initialize a variable i with a value of 1
//     do {
//         println(i)  // Print the value of i
//         i++  // Increment the value of i by 1
//     } while (i <= 5)  // Continue the loop as long as i is less than or equal to 5
// }
 

// Explanation:

// 1. `var i = 1`: This line initializes a variable `i` with a value of 1. The `var` keyword is used to declare a mutable variable in Kotlin, which means its value can be changed later in the program.

// 2. `do { ... } while (condition)`: This is a `do-while` loop. The code block inside the curly braces `{ ... }` is executed first, and then the condition inside the parentheses `()` is checked. If the condition is true, the loop continues to execute. If the condition is false, the loop terminates. In this case, the loop continues as long as the value of `i` is less than or equal to 5.

// 3. `println(i)`: Inside the loop, the current value of `i` is printed to the console using the `println()` function.

// 4. `i++`: This line increments the value of `i` by 1 in each iteration of the loop. The `++` operator is the increment operator in Kotlin, used to increase the value of a variable by 1.

// 5. `while (i <= 5)`: This is the condition of the `do-while` loop. It checks if the value of `i` is less than or equal to 5. If this condition is true, the loop continues to execute; otherwise, the loop terminates.

// When you run this code, it will print the numbers 1 through 5, each on a new line, because the loop continues until `i` becomes greater than 5.


// 4 forEach loop
 
// the forEach loop is commonly used to iterate over elements in a collection and perform a specific action for each element. Here's an example:


// fun main() {
//     val numbers = listOf(1, 2, 3, 4, 5)

//     numbers.forEach {
//         println(it * 2)
//     }
// }

// In this example, we have a list of numbers, and we use the forEach loop to iterate over each element in the numbers list. The lambda expression { println(it * 2) } is the action that will be performed for each element. It simply prints each element multiplied by 2.

// Summary:

// The forEach loop is a concise way to iterate over elements in a collection in Kotlin.
// It takes a lambda expression as an argument, which defines the action to be performed on each element.
// The lambda parameter (in this case, it) represents each element in the collection.
// It's a functional approach to iteration and can be used with various types of collections like lists, sets, and arrays.