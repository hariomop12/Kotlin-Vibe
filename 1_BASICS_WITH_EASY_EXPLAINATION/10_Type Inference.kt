// Type inference in Kotlin refers to the compiler's ability to automatically determine the data type of a variable or expression based on the value assigned to it, without explicitly specifying the type. This feature reduces boilerplate code and makes the codebase more concise and readable.

// Here's an example to illustrate type inference in Kotlin:

 
fun main() {
    // Type inference for variables
    val name = "John"  // Compiler infers that name is of type String
    val age = 30       // Compiler infers that age is of type Int
    
    // Type inference for function return types
    val result = add(5, 3)  // Compiler infers that result is of type Int
    
    // Type inference for expressions
    val pi = 3.14            // Compiler infers that pi is of type Double
    val flag = true          // Compiler infers that flag is of type Boolean
    
    println("Name: $name, Age: $age")
    println("Result of addition: $result")
}

fun add(a: Int, b: Int) = a + b  // Compiler infers that the return type is Int


In this example:

// - When we declare the variables `name` and `age`, we don't explicitly specify their types. The compiler infers that `name` is a `String` because it's initialized with a string literal, and `age` is an `Int` because it's initialized with an integer literal.

// - Similarly, when calling the `add` function, we don't specify the return type. The compiler infers that the return type of the `add` function is `Int` because the expression `a + b` evaluates to an integer.

// - In the case of `pi` and `flag`, the compiler infers their types based on the assigned values (`Double` for `pi` and `Boolean` for `flag`).

// Type inference simplifies the code-writing process by eliminating the need to explicitly specify types in many cases, leading to cleaner and more maintainable code. However, it's important to note that explicit type annotations can still be used when necessary or beneficial for clarity.