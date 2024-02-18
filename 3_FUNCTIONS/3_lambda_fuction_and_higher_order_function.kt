// lambda  function


// Lambda expressions in Kotlin provide a concise way to define anonymous functions. They are particularly useful for passing functionality as arguments to higher-order functions or for implementing functional programming concepts. Lambda expressions are denoted by curly braces `{}` and can have zero or more parameters, separated by commas, followed by the `->` symbol, and then the function body.

// Here's an explanation of lambda expressions with an example:


// fun main() {
//     // Example 1: Lambda expression with no parameters
//     val greet: () -> Unit = { println("Hello!") }
//     greet() // Output: Hello!

//     // Example 2: Lambda expression with parameters
//     val add: (Int, Int) -> Int = { a, b -> a + b }
//     val result = add(3, 5)
//     println("Result: $result") // Output: Result: 8

//     // Example 3: Lambda expression as an argument to a higher-order function
//     val numbers = listOf(1, 2, 3, 4, 5)
//     val squaredNumbers = numbers.map { it * it }
//     println("Squared Numbers: $squaredNumbers") // Output: Squared Numbers: [1, 4, 9, 16, 25]
// }


// In this example:

// 1. **Example 1**: We define a lambda expression `greet` with no parameters that simply prints "Hello!". The type of `greet` is `() -> Unit`, indicating that it takes no parameters and returns `Unit` (similar to `void` in Java). We then call `greet()` to execute the lambda expression.

// 2. **Example 2**: We define a lambda expression `add` with two parameters `a` and `b` of type `Int`, and it returns the sum of `a` and `b`. The type of `add` is `(Int, Int) -> Int`, indicating that it takes two `Int` parameters and returns an `Int`. We then call `add(3, 5)` to add two numbers.

// 3. **Example 3**: We use a lambda expression as an argument to the `map` function, which is a higher-order function. The lambda expression `it * it` squares each element of the `numbers` list. The result is stored in `squaredNumbers`, which contains the squared numbers of the original list.

// Lambda expressions are concise and allow for the implementation of functional programming concepts like higher-order functions, function composition, and more. They are widely used in Kotlin to simplify code and make it more expressive.



//  Higher-Order Functions

// Higher-order functions are functions that can accept other functions as parameters or return functions as results. In Kotlin, functions are first-class citizens, which means they can be treated as values and passed around like other types such as `Int`, `String`, etc. This allows us to define higher-order functions that can take other functions as arguments or return functions as results.

// Higher-order functions in Kotlin are functions that can take other functions as parameters and/or return functions as results. In Kotlin, functions are first-class citizens, meaning they can be treated as values, passed around, and manipulated just like any other type.

// Here's an explanation of higher-order functions with an example:


// Define a higher-order function called `operation` that takes two integers and a function as parameters

// fun operation(x: Int, y: Int, action: (Int, Int) -> Int): Int {
//     return action(x, y)
// }

// // Define a function called `add` that takes two integers and returns their sum
// fun add(a: Int, b: Int): Int {
//     return a + b
// }

// // Define a function called `subtract` that takes two integers and returns their difference
// fun subtract(a: Int, b: Int): Int {
//     return a - b
// }

// fun main() {
//     val result1 = operation(10, 5, ::add) // Passing the `add` function as an argument
//     println("Result of addition: $result1") // Output: Result of addition: 15
    
//     val result2 = operation(10, 5, ::subtract) // Passing the `subtract` function as an argument
//     println("Result of subtraction: $result2") // Output: Result of subtraction: 5
// }
 

// In this example:

// - We define a higher-order function called `operation` that takes two integers (`x` and `y`) and a function (`action`) as parameters. The function `action` is a higher-order function itself, taking two integers and returning an integer.
// - We define two functions (`add` and `subtract`) that have the same signature as the function expected by `operation`. These functions represent different operations (addition and subtraction).
// - In the `main()` function, we call the `operation` function twice:
//   - First, with `add` as the `action` parameter, which performs addition.
//   - Second, with `subtract` as the `action` parameter, which performs subtraction.
// - The result of each operation is printed to the console.

// Higher-order functions enable powerful abstractions and allow you to write more concise and flexible code by treating functions as values that can be passed around and manipulated. They are commonly used in functional programming paradigms and are a key feature of Kotlin.