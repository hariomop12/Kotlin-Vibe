// Scope functions in Kotlin are a set of functions that allow you to perform operations within a specific scope, typically on an object, and provide concise ways to access and manipulate properties or execute code block within that scope. These functions are often used in scenarios such as object initialization, chaining method calls, or applying transformations to objects.

// There are five main scope functions in Kotlin:

// 1. **let**: Executes a block of code and returns the result of the last expression within the block. It's useful for performing null checks and executing operations on non-null objects.

// 2. **run**: Similar to `let`, but it operates on the object itself (`this`) rather than passing it as an argument. It's useful when you want to access the properties and methods of the object directly.

// 3. **with**: Allows you to call multiple methods on an object without repeating the object reference. It takes the object as its receiver and returns the result of the last expression within its block.

// 4. **apply**: Used for initializing objects or configuring their properties. It takes the object as its receiver and returns the object itself after applying the operations specified in the block.

// 5. **also**: Similar to `apply`, but it returns the object itself (`this`) rather than the result of the last expression within the block. It's useful for performing additional actions on an object without affecting the chain.

// Here's a brief overview of how each scope function works:

// - `let`: `object.let { /* code block */ }`
// - `run`: `object.run { /* code block */ }`
// - `with`: `with(object) { /* code block */ }`
// - `apply`: `object.apply { /* code block */ }`
// - `also`: `object.also { /* code block */ }`

// Each scope function has its own use cases and advantages, and choosing the right one depends on the specific requirements of your code. They provide powerful tools for working with objects and writing expressive and concise Kotlin code.


// 1 let

// let can be used for scoping and null-checks. When called on an object, let executes the given block of code and returns the result of its last expression. The object is accessible inside the block by the reference it (by default) or a custom name.

// // val message: String? = "Hello"
// // message?.let {
// //     print(it.toUpperCase()) // Output: "HELLO"
// // }

// 2 run

// Like let, run is another scoping function from the standard library. Basically, it does the same: executes a code block and returns its result. The difference is that inside run the object is accessed by this. This is useful when you want to call the object's methods rather than pass it as an argument.

// // val message: String? = "Hello"
// // message?.run {
// //     print(this.toUpperCase()) // Output: "HELLO"
// // }

// 3 with
// with is a non-extension function that can access members of its argument concisely: you can omit the instance name when referring to its members.

// // val person = Person("Ali", 24)
// // val message = with(person) {
// //     "My name is $name and I'm $age years old."
// // }


// 4 apply

// apply executes a block of code on an object and returns the object itself. Inside the block, the object is referenced by this. This function is handy for initializing objects.

// // val person = Person("Ali", 24)
// // person.apply {
// //     name = "Ali"
// //     age = 24
// // }

// 5 also

// also works like apply: it executes a given block and returns the object called. Inside the block, the object is referenced by it, so it's easier to pass it as an argument. This function is handy for embedding additional actions, such as logging in call chains.

// // val message: String? = "Hello"
// // message?.also {
// //     print(it.toUpperCase()) // Output: "HELLO"
// // }

// In summary, scope functions are powerful tools for working with objects in Kotlin. They provide concise and expressive ways to access and manipulate properties, execute code blocks, and perform additional actions on objects. By understanding the differences and use cases of each scope function, you can write more expressive and readable code in Kotlin.
