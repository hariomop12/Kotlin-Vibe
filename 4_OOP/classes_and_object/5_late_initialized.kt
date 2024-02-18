// Late-initialized properties and variables
// A lateinit variable is used when you know that a variable will be initialized before it is used, but you don't want to assign an initial value at the time of declaration.

// lateinit var myLateInitVar: String

// // The variable is not initialized yet, so trying to access it will throw an exception
// // println(myLateInitVar) // This line would throw a "lateinit property has not been initialized" exception

// // Sometime later, the variable is initialized
// myLateInitVar = "Hello World"

// // Now we can access the variable without an exception
// println(myLateInitVar) // Prints "Hello World"