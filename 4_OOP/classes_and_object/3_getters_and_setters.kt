// Gettters and Setters in Kotlin

// In Kotlin, getters and setters are special functions that are automatically generated for properties declared in classes. They allow you to control access to the properties and perform additional logic when getting or setting their values.

// Here's a simple explanation of getters and setters:

// Getters

// - **What they do**: Getters are functions that return the current value of a property.
// - **When they're used**: Whenever you read the value of a property.
// - **How they're used**: When you access a property using dot notation, like `object.property`.
// - **Example**: If you have a `name` property in a class, the getter will return the current value of `name` when you access it.

// Setters

// - **What they do**: Setters are functions that set a new value to a property.
// - **When they're used**: Whenever you assign a new value to a property.
// - **How they're used**: When you assign a value to a property using dot notation, like `object.property = newValue`.
// - **Example**: If you have a `name` property in a class, the setter will set the new value to `name` when you assign a value to it.

// In Kotlin, you don't always need to explicitly define getters and setters because they're generated automatically for properties declared using `var` or `val`. However, you can customize their behavior if needed.

// Here's an example of a class with a property `name` and custom getter and setter:

 
// class Person {
//     var name: String = ""
//         get() {
//             println("Getting name")
//             return field
//         }
//         set(value) {
//             println("Setting name to $value")
//             field = value
//         }
// }
 

// // - In this example, we have a `name` property with a custom getter and setter.
// // - The getter prints a message "Getting name" and then returns the current value of the `name` property.
// // - The setter prints a message "Setting name to $value" and then assigns the new value to the `name` property.

// // Using getters and setters, you can add validation, logging, or any custom logic when accessing or modifying properties in your classes.