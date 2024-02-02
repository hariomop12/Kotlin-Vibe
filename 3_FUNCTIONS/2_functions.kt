// A block of code that performs a specific task
// Breaks a large program into smaller modular chunks
// Declared using the fun keyword
// Can take arguments with either named or default values


// (Almost) Everything has a value in Kotlin, including functions. This means that you can store functions in variables, pass them as arguments to other functions, and return them from other functions. This is known as higher-order functions.
// (Almost) Everything is an expression in Kotlin, including functions. This means that you can use functions as part of other expressions, such as when you want to return a value from a function based on a condition.


// 1 Unit returning functions
// If a function does not return any useful value, its return type is Unit
// Unit is similar to void in Java
// eg. 

// fun printMessage(message: String): Unit {
//     println(message)
// }

// fun performTask(): Unit {
//     // Some task is performed here
//     println("Task performed.")
// }

// fun main() {
//     // Calling functions that return Unit
//     printMessage("Hello, World!")
//     performTask()
// }



// 2 function with arguments


// 1 default parameters
// 2 required parameters
// 3 named parameters

// 1 default parameters

// fun greet(name: String, greeting: String = "Hello") {
//     println("$greeting, $name!")
// }

// fun main() {
//     greet("Alice")  // Uses the default greeting
//     greet("Bob", "Hi")  // Provides a custom greeting
// }

// In this example:

// The greet function has two parameters: name (required) and greeting (with a default value of "Hello").
// When you call greet("Alice"), it uses the default value for greetifun greet(name: String, age: Int) {
//     println("Hello, $name! You are $age years old.")
// }

// fun main() {
//     // Call the greet function with required parameters
//     greet("Alice", 25)

//     // Uncommenting the next line will result in a compilation error

//     // greet("Hariom") // Error: Not enough arguments for function greet
// }ng and prints "Hello, Alice!".
// When you call greet("Bob", "Hi"), you provide a custom value for greeting, and it prints "Hi, Bob!".


// 2 required parameters

// In this example:

// 1 The greet function takes two parameters: name of type String and age of type Int.
// 1 Inside the function, it prints a greeting message that includes the provided name and age.
// When you call the greet function in the main function, you must provide values for both name and age. If you try to call it with insufficient arguments (e.g., greet("Boob")), the Kotlin compiler will produce a compilation error because the required parameters are missing.

// 3 named parameters

// Named parameters in Kotlin allow you to specify the names of parameters when calling a function, making the code more readable and improving clarity. Here's an example: 

// fun greetPerson(firstName: String, lastName: String, age: Int) {
//     println("Hello, $firstName $lastName! Age: $age")
// }

// fun main() {
//     // Calling the function with named parameters
//     greetPerson(firstName = "John", lastName = "Doe", age = 30)

//     // The order of named parameters can be different
//     greetPerson(age = 25, firstName = "Alice", lastName = "Smith")
// }

// In this example:
// The greetPerson function takes three parameters: firstName, lastName, and age.

// When calling the greetPerson function, you can use named parameters to make the code more readable. The order of the parameters doesn't matter when named parameters are used.

// In the main function, there are two examples of calling greetPerson with named parameters. The names of the parameters make it clear which argument corresponds to each parameter, enhancing the readability of the code.

// Using named parameters becomes especially useful when a function has many parameters or when you want to make the code more self-explanatory.

// 3 compect function --> 1 line function or single expression function
// Compact functions, or single-expression functions, make your code more concise and readable. 
// one way of wrtting code 


// complete function --> 

// fun double(x: Int): Int {
//     x * 2
// }

// compect function -->   
// fun double(x: Int):Int = x * 2



// 4 Higher-order functions and lambdas 
// Higher-order functions are functions that take other functions as parameters or return functions or do both.
// :: is used to pass a function as an argument to another function

// fun main() {
//     calculate(5, 10, ::sum)
//     calculate(5, 10, ::difference)
// }

// fun sum(x: Int, y: Int) = x + y
// fun difference(x: Int, y: Int) = x - y

// fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
//      var result = operation(x, y)
//         println(result)
// }


// Lambdas are a way to define a function in a shorter, more concise way. They are especially useful when you want to pass a function as an argument to another function.

// normal eg of lambdas
// val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
// val difference = { x: Int, y: Int -> x - y }


fun main() {
    // Example 1: Lambda as an argument to a function
    val square: (Int) -> Int = { x -> x * x }
    val result = square(5)
    println("Square of 5 is: $result")

    // Example 2: Lambda as a variable
    val greet: (String) -> Unit = { name -> println("Hello, $name!") }
    greet("John")

    // Example 3: Lambda in a higher-order function
    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map { it * it }
    println("Original numbers: $numbers")
    println("Squared numbers: $squaredNumbers")
}

// Explanation:

// Example 1: Lambda as an argument to a function:

// val square: (Int) -> Int declares a variable named square with a lambda function that takes an Int parameter and returns an Int.
// { x -> x * x } is the actual lambda expression, squaring the input x.
// square(5) calls the lambda with the argument 5, resulting in 25.
// Example 2: Lambda as a variable:

// val greet: (String) -> Unit declares a variable named greet with a lambda function that takes a String parameter and returns Unit (void).
// { name -> println("Hello, $name!") } is the lambda expression that prints a greeting.
// greet("John") calls the lambda with the argument "John".
// Example 3: Lambda in a higher-order function:

// numbers.map { it * it } uses a lambda to square each element in the list.
// The map function applies the lambda to each element of the numbers list, resulting in a new list of squared numbers.
// Lambda expressions in Kotlin provide a concise and expressive way to define functions, especially when working with higher-order functions or functional programming constructs. They are a powerful feature of the Kotlin language that can help you write more readable and maintainable code.


