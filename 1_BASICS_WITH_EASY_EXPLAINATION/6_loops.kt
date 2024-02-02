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
fun main() {
    // Example for loop in Kotlin
    for (i in 1..5) {
        val square = i * i
        println("The square of $i is $square")
    }
}
 

 
//  2 while loop
// while loop is used to execute a block of code repeatedly until a given condition is true and it run one time if the condition is false

// syntax of while loop
// while(condition){
//     // code to be executed
// }

// example of while loop

// fun main() {
//     var i = 1
//     while (i <= 10) {
//         println(i)
//         i++
//     }
// }



//  3 do while loop
// do while loop is used to execute a block of code repeatedly until a given condition is true and it run one time if the condition is false

// fun main() {
//     var i = 1
//     do {
//         println(i)
//         i++
//     } while (i <= 5)
// }



// forEach loop
 
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