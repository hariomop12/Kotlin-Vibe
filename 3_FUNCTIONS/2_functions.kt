//general syntax of function

// fun functionName(parameter1: Type, parameter2: Type, ...): ReturnType {
//     // Function body
// }


// types are discussed below
// 1 Unit returning functions
// 2 function with arguments
// 3 compect function --> 1 line function or single expression function
// 4 function with "Unit" return type
// 5 Local functions
// 6 Member functions
// 7 GENERIC FUNCTION
// 8 Extension functions
// 9 Infix functions



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

// A function can have one or more arguments (parameters) that are used to perform some operation and produce a result. Here's an example of a function with arguments:

// 1 default parameters
// 2 required parameters
// 3 named parameters

// 1 default parameters

// fun greet(name: String, greeting: String = "Hello") {
//     println("$greeting, $name!")
// }

// fun main() {
//     greet("Alice")      // Uses the default greeting
//     greet("Bob","Hi")  // Provides a custom greeting
    
// }

// In this example:

// The greet function takes two parameters: name of type String and greeting of type String. The greeting parameter has a default value of "Hello".

// When you call the greet function in the main function with only one argument (e.g., greet("Alice")), the default value of the greeting parameter is used.

// If you provide a value for the greeting parameter (e.g., greet("Bob", "Hi")), the provided value is used instead of the default value.

// 2 required parameters
// fun greeting(name: String,Age: Int ) {
//     println("Hello $name,Your Age is $Age!")
// }
// fun main() {
//     greeting("Alice", 25)
//     greeting("Bob", 30)
// }

// In this example:

// 1 The greet function takes two parameters: name of type String and age of type Int.
// 1 Inside the function, it prints a greeting message that includes the provided name and age.
// When you call the greet function in the main function, you must provide values for both name and age. If you try to call it with insufficient arguments (e.g., greet("Bob")), the Kotlin compiler will produce a compilation error because the required parameters are missing.

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


// complete function --> eg

// // Normal function 
// fun double(x: Int): Int {
//     x * 2
//  }

// // compect function -->   
// fun double(x: Int):Int = x * 2

// // 4 function with "Unit" return type 

// // In Kotlin, functions can have a return type of `Unit` if they do not return any meaningful value. `Unit` in Kotlin is equivalent to `void` in languages like Java or C#. It indicates that the function performs an action or operation but does not produce any result.

// // Here's an example of a function with a return type of `Unit`:

 
// fun greet(name: String): Unit {
//     println("Hello, $name!")
// }
 

// // In this example, the `greet` function takes a `String` parameter `name` and prints a greeting message to the console. Since it doesn't return any value, its return type is `Unit`.

// // You can call this function like so:

 
// fun main() {
//     greet("Alice")
// }
 
// // When you run the `main` function, it will print:

// // Hello, Alice!
 

// // The `Unit` return type is optional in Kotlin. If you don't specify any return type explicitly, the compiler will infer it as `Unit` for functions that do not return a value.

// // Here's the same `greet` function without explicitly specifying the return type:

 
// // fun greet(name: String) {
// //     println("Hello, $name!")
// // }
 

// // It's equivalent to the previous example with `Unit` return type explicitly specified. Both versions of the `greet` function behave identically.+






// // 5 Local functions

// // Kotlin supports local functions, which are functions inside other functions. printMessage() is a local function defined within the main() function.

// fun main() {
//     fun printMessage(message: String) {
//         println("Message: $message")
//     }
//     printMessage("Hello, world!")
// }


// // Explanation:
// // printMessage() is a local function defined within the main() function.
// // It takes a String parameter message and prints the message with a prefix "Message: "..
// // The main() function calls printMessage() with the message "Hello, world!".
// // When you run the main() function, it will print:
// // Message: Hello, world!
// // Local functions are useful for breaking down complex logic into smaller, more manageable pieces. They can access the variables of the enclosing function, which can help reduce code duplication and improve readability.


// 6 Member functions
// Member functions are functions that are defined inside a class or an object. They are called on instances of the class or object using the dot notation. Here's an example of a member function defined inside a class:

// A member function is a function that is defined inside a class or object.

// class Sample {
//     fun foo() {//...}
// }
// }

// 6 GENERIC FUNCTION

// Generic functions in Kotlin allow you to write functions that can work with any type. They enable you to write reusable code that is type-safe, without the need to create multiple function implementations for different data types. Generic functions are defined using type parameters.

// Here's an explanation of generic functions in Kotlin with an example:

// fun <T> printItem(item: T) {
//     println(item)
// }

// fun main() {
//     printItem(5)       // Calling generic function with an Integer
//     printItem("Hello") // Calling generic function with a String
//     printItem(true)    // Calling generic function with a Boolean
// }

// In this example:

// - `printItem` is a generic function defined using `<T>` syntax, where `T` is a type parameter representing any type.
// - Inside the function body, the parameter `item` is of type `T`.
// - When `printItem` is called, the compiler infers the type based on the argument passed to it.
// - In the `main` function, `printItem` is called three times with different types of arguments: an `Int`, a `String`, and a `Boolean`.
// - The generic function `printItem` works with all three types without the need for overloaded functions or explicit type casting.

// Using generic functions in Kotlin allows you to write flexible and reusable code that can operate on various types while maintaining type safety. They are particularly useful when you want to write container-like structures such as lists, maps, or other data structures that need to work with any type of data.


// 7 Extension functions
// Extension functions in Kotlin allow you to add new behaviors or actions to existing classes without changing their original code. It's like adding a new tool to a toolbox without modifying the existing tools.

// Let's take a simple example:

// Suppose you have a toolbox with a hammer (representing a class) in it. But you want to add a screwdriver (representing a new functionality) to the toolbox without modifying the hammer itself. That's where extension functions come in.

// Here's a more straightforward explanation with code:

 
// Define an extension function on the String class
// fun String.addHello(): String {
//     return "Hello, $this"
// }

// fun main() {
//     val name = "Alice"
//     val message = name.addHello() // Calling the extension function
//     println(message) // Output: Hello, Alice
// }
 

// In this example:

// - We add a new function called `addHello()` to the `String` class. This function adds "Hello, " in front of any string it's called on.
// - Then in the `main()` function, we create a variable called `name` with the value "Alice".
// - We call the extension function `addHello()` on the `name` variable, which wasn't available before.
// - This function modifies the `name` by adding "Hello, " to it and returns the modified string.
// - Finally, we print the modified string, which now says "Hello, Alice".

// So, extension functions allow you to make your code more organized and flexible by adding new capabilities to existing classes without changing their original implementation. It's like extending your toolkit with new tools whenever you need them!

// its basic propertys are
// here are some basic properties of extension functions in Kotlin:

// Extension functions are defined outside the class they extend: Unlike regular member functions, extension functions are defined outside the class they extend.

// Syntax: The syntax for defining an extension function is: fun receiverType.functionName() { /* function body */ }. Here, receiverType is the type being extended, and functionName is the name of the extension function.

// Access to Receiver Object: Inside the extension function, you can access the properties and methods of the receiver object (the object on which the extension function is called) using the this keyword.

// Visibility: Extension functions can be defined in the same file or in separate files as long as they are imported where they are needed. They cannot access private members of the class they extend.

// Extension Properties: In addition to functions, Kotlin also supports extension properties, which allow you to add new properties to existing classes.

// Can't Override Existing Functionality: Extension functions cannot override existing functions or properties of the extended class. If you define an extension function with the same name as an existing function or property, the extension function will be called when used with instances of the extended class, but it won't override the existing functionality.

// Use Cases: Extension functions are commonly used to add utility methods to classes from the standard library, to extend classes from third-party libraries, or to improve the readability and organization of your code.

// These are some basic properties of extension functions in Kotlin. They provide a convenient way to add functionality to existing classes without modifying their source code, promoting code reusability and maintainability.


// 9 Infix functions 

// In Kotlin, infix notation is a feature that allows you to call certain functions in a special way. It enables you to call functions with a single argument without using the traditional dot and parentheses syntax. To use infix notation, you need to mark the function with the `infix` keyword.

// Here's how infix notation works with an example:


// Define an infix function
infix fun Int.add(other: Int): Int {
    return this + other
}

fun main() {
    val result = 5 add 3 // Calling the infix function
    println("Result: $result") // Output: Result: 8
}

// In this example:

// - We define an infix function called `add` that adds two integers.
// - The `infix` keyword is used to mark the function as infix.
// - Inside the `main()` function, instead of calling the function using the traditional dot notation (`5.add(3)`), we can call it using infix notation (`5 add 3`).
// - The `add` function is called with `5` as the left-hand operand (the receiver object) and `3` as the right-hand operand (the argument).
// - The result is calculated and stored in the `result` variable, which is then printed, resulting in "Result: 8" being printed to the console.

// Infix notation is particularly useful for functions that represent operations between two objects and improve code readability by allowing you to write expressions in a more natural, math-like manner. However, infix functions can only be member functions or extension functions with a single parameter.


