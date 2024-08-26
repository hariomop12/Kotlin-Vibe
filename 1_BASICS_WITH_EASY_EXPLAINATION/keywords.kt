// List of commonly used keywords 
// 1 Unit keyword
// 2 until keyword
// 3 is keyword 
// 4 Any Keyword -> (thoda hard hai)
// 5 when Keyword 
// 6 open keyword
// 7 return keyword
// 9 it keyword
// 10 apply keyword

//keyword in kotlin --> 
// In Kotlin, a keyword is a reserved word that has a predefined meaning and cannot be used for any other purpose within the programming language. Keywords are an essential part of the language syntax and are used to define the structure, behavior, and flow of Kotlin code.

// Here's an example demonstrating the use of keywords in Kotlin:

 
// fun main() {
//     val number = 10
//     val keyword = "fun"
    
//     // Using 'if' as a keyword
//     if (number > 5) {
//         println("Number is greater than 5.")
//     } else {
//         println("Number is not greater than 5.")
//     }
    
//     // Using 'when' as a keyword
//     when (keyword) {
//         "fun" -> println("Keyword is 'fun'.")
//         "val" -> println("Keyword is 'val'.")
//         else -> println("Unknown keyword.")
//     }
    
//     // Using 'return' as a keyword
//     println("Returning from function.")
//     return
// }
 

// In this example:

// - `if`, `else`, `when`, and `return` are keywords used to control the flow of the program.
// - `val` is a keyword used to declare read-only (immutable) variables.
// - `fun` is a keyword used to define functions.

// Keywords like `if`, `else`, `when`, `return`, `val`, and `fun` have predefined meanings in Kotlin and cannot be used as identifiers (such as variable names or function names) within the code. They play a crucial role in defining the structure and behavior of Kotlin programs.


// For more complex scenarios, Kotlin provides the `when` expression, which is similar to a `switch` statement in other languages.
// when is used to check multiple conditions and execute a block of code based on the first condition that is true. Here's an example:
// fun main() {
//     val number = 10

//     when {
//         number > 0 -> println("Positive")
//         number < 0 -> println("Negative")
//         else -> println("Zero")
//     }
// }



// 2  Unit keyword
// In Kotlin, the Unit keyword is used to indicate that a function does not return any meaningful value. It is similar to void in some other programming languages. Here's a simple example: 
// fun printMessage(message: String): Unit {
//     println(message)
// }
// fun main() {
//     printMessage("Hello, Kotlin!")
// }


// 7 until --> until is used to exclude the last number

//for example
// fun main() {
//     val x = 10
//     for (x in 1 until 10) {
//         println(x)
//     }
// }

// basically it will print from 1 to 9 and will exclude 10  because of until

// 1 Unit keyword


// In Kotlin, the Unit keyword is used to indicate that a function does not return any meaningful value. It is similar to void in some other programming languages. Here's a simple example: 

// fun printMessage(message: String): Unit {
//     println(message)
// }
// fun main() {
//     printMessage("Hello, Kotlin!")
// }


// 2 until --> until is used to exclude the last number

//for example
// fun main() {
//     val x = 10
//     for (x in 1 until 10) {
//         println(x)
//     }
// }

// basically it will print from 1 to 9 and will exclude 10  because of until



// 3 is keyword  

// In Kotlin, the `is` keyword is used to check the type of an object at runtime. It allows you to determine whether an object is an instance of a specific type or one of its subtypes. 

// Here's how the `is` keyword works:

//  fun main(){
// val obj: Any = "Hello"

// if (obj is String) {
//     println("obj is a String")
//     // You can safely use obj as a String here
//     println("Length of obj is ${obj.length}")
// } else {
//     println("obj is not a String")
// }
//  }
 

// In this example, the `is` keyword is used to check if `obj` is of type `String`. If it is, the code block inside the `if` statement is executed, and within that block, `obj` can be treated as a `String` without any explicit casting. If `obj` is not a `String`, the code block inside the `else` statement is executed.

// The `is` keyword is particularly useful in Kotlin for safe type casting and type checking, especially in scenarios where you want to ensure type safety at runtime. It's commonly used in combination with `when` expressions or in `if` statements to handle different types of objects appropriately.


// 4 Any Keyword


// In Kotlin, `Any` is a special keyword that represents the root of the Kotlin class hierarchy. It's similar to `Object` in Java or `NSObject` in Swift. Here's a simple explanation of `Any`:

// 1. **Root of the Hierarchy**: `Any` is the superclass of all non-nullable types in Kotlin. This means that every non-nullable type in Kotlin implicitly inherits from `Any`.

// 2. **Similar to Object in Java**: Just like `Object` in Java, `Any` in Kotlin can hold any kind of value, whether it's a primitive type, an object, or a function reference.

// 3. **Use in Generic Programming**: When you're writing generic code in Kotlin and you want it to work with any type, you can specify `Any` as the type parameter.

// 4. **Methods and Properties**: `Any` provides a few common methods and properties that are available to all Kotlin objects, such as `equals()`, `hashCode()`, and `toString()`.

// 5. **Equals**: `Any` provides the `equals()` method for checking the equality of objects. However, unlike Java, in Kotlin `equals()` is a member function, not a static one.

// 6. **Safe Casting**: Since everything inherits from `Any`, you can use safe casts (`as?`) to cast any object to `Any`. If the cast fails, it returns `null`.

// Here's a simple example demonstrating the use of `Any`:

 
// fun main() {
//     val anyValue: Any = "Hello, Kotlin!" // anyValue can hold any type of value
//     println(anyValue)

//     if (anyValue is String) {
//         println("Length of string: ${anyValue.length}") // Using length property
//     }

//     val someValue: Any = 42 // anyValue can also hold an integer
//     println(someValue)

//     if (someValue is Int) {
//         println("Squared value: ${someValue * someValue}") // Performing operations
//     }
// }
 
// In this example, `anyValue` and `someValue` can hold any type of value, and we're able to perform operations on them based on their actual type. This flexibility is provided by the `Any` keyword in Kotlin.

 

// Yes, that's correct. The `Any` class in Kotlin provides several common properties and methods that are available to all Kotlin objects. These include:

// 1. **equals()**: This method is used to compare the equality of two objects. By default, it checks for reference equality, but it can be overridden in subclasses to provide custom equality checks based on object content.

// 2. **hashCode()**: This method returns a hash code value for the object. It's often used when storing objects in hash-based collections like HashMap or HashSet.

// 3. **toString()**: This method returns a string representation of the object. By default, it returns a string containing the class name and the memory address of the object, but it can be overridden in subclasses to provide custom string representations.

// These properties and methods are commonly used in Kotlin code, and since `Any` is the root of the Kotlin class hierarchy, they are available to all Kotlin objects. However, it's important to note that while these properties and methods are commonly used, they are not the only ones available. Depending on the specific needs of your code, you may also need to use other methods and properties provided by specific classes or interfaces.


// 5 when Keyword 

// For more complex scenarios, Kotlin provides the `when` expression, which is similar to a `switch` statement in other languages.

// fun main() {
//     val number = 10

//     when {
//         number > 0 -> println("Positive")
//         number < 0 -> println("Negative")
//         else -> println("Zero")
//     }
// }

// get logic by yourself 


// 6 open keyword
// The open keyword is used to allow a class to be inherited by other classes. By default, classes in Kotlin are final, which means they cannot be inherited. However, by marking a class with the open keyword, you can make it inheritable.

// 7 return keyword
// The return keyword is used to exit a function or a lambda expression and return a value. It can also be used to return from a labeled function or a lambda expression. Here's an example:

// fun sum(a: Int, b: Int): Int {
//     return a + b
// }

// 9 it keyword

// In Kotlin, "it" is a special keyword that can be used in certain contexts, particularly with higher-order functions and lambda expressions. It's a shorthand way to refer to the single parameter passed to a lambda when there's only one parameter.

// Here's a simple breakdown:

// 1. **Lambda Expressions**: In Kotlin, you can define functions anonymously using lambda expressions. When you have a lambda with only one parameter, you can use "it" instead of explicitly declaring the parameter.

  
//    val numbers = listOf(1, 2, 3, 4, 5)
//    val doubled = numbers.map { it * 2 }
 

//    Here, "it" refers to each element of the list `numbers` as the lambda is applied to each element.

// 2. **Single Parameter**: "it" can only be used when there's a single parameter in the lambda expression. If there are multiple parameters, you have to explicitly declare them.

   
//    val sum = { a: Int, b: Int -> a + b } // Here, "it" cannot be used because there are two parameters.
 

// 3. **Readability and Conciseness**: Using "it" can make code more concise and readable, especially when the lambda body is short.

//    For instance:
 
//    val names = listOf("Alice", "Bob", "Charlie")
//    val lengths = names.map { it.length } // Using "it" to refer to the length of each name.
 

// In summary, "it" is a handy shorthand in Kotlin for referring to a single parameter in lambda expressions, making code more concise and readable in certain contexts.


// 10 apply keyword

// In Kotlin, the `apply` function is an extension function that allows you to configure or initialize an object within a block and then return the object itself. It’s often used for object construction and configuration, making your code more concise and readable. Let's break down the usage and behavior of `apply` with some examples.

// ### Key Characteristics of `apply`

// 1. **Receiver Context**: Inside the `apply` block, the object on which `apply` is called becomes the receiver (`this`). This means you can access the object’s properties and methods directly without using the object’s name.

// 2. **Returns the Object**: The `apply` function always returns the object it was called on. This is useful when you want to perform some initialization or configuration on an object and then continue using it.

// 3. **Common Use Cases**: It's commonly used for object creation, initialization, or when you need to modify an object and continue working with it in a fluent style.

// ### Basic Syntax
 
// val result = object.apply {
//     // Initialization or configuration code
// }
 

// ### Example Usage

// #### 1. Initializing an Object

data class User(var name: String, var age: Int)

val user = User("John Doe", 30).apply {
    name = "Jane Doe"
    age = 25
}

println(user) // Output: User(name=Jane Doe, age=25)

// - **Explanation**: Here, `apply` is used to configure the `User` object right after it's created. The properties `name` and `age` are modified within the `apply` block, and the modified object is returned.

// #### 2. Building a Complex Object
 
// val list = mutableListOf<String>().apply {
//     add("Kotlin")
//     add("Java")
//     add("Swift")
// }

// println(list) // Output: [Kotlin, Java, Swift]
 
// - **Explanation**: A `MutableList` is created, and `apply` is used to add elements to it. The `apply` block allows the list to be configured and returned, all in one line.

// #### 3. Configuring Views in Android
// In Android development, `apply` is commonly used to configure views.
 
// val button = Button(context).apply {
//     text = "Click Me"
//     textSize = 20f
//     setOnClickListener {
//         // Handle click
//     }
// }
 
// - **Explanation**: Here, `apply` is used to configure a `Button` immediately after it’s created. This is particularly handy in Android for keeping the view initialization clean and readable.

// ### Why Use `apply`?

// - **Fluent Code Style**: It promotes a fluent and clean code style, especially when configuring objects.
// - **Readability**: It improves code readability by grouping the configuration logic together.
// - **Conciseness**: It reduces the need to repeatedly reference the object being configured.


// The `apply` function is a powerful tool in Kotlin that helps in object initialization and configuration while keeping the code clean and concise. By using `apply`, you can streamline the creation and configuration of objects, making your code more readable and maintainable.
