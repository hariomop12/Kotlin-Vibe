// 1 string templateing
// 2  Unit keyword
// 3 parameters
// 4 Short circuiting
// 5 type casting
// 6 concatenation
// 7 until





// 1 String Templateing
// what is String Templateing? --> String templateing is a way to include the values of the variables in a string 
// for eg
// var name = "Kotlin"
// println("Hello, $name!")
// $name is the variable name which is included in the string and the value of the variable is printed in the output 

// 2  Unit keyword
// In Kotlin, the Unit keyword is used to indicate that a function does not return any meaningful value. It is similar to void in some other programming languages. Here's a simple example: 
// fun printMessage(message: String): Unit {
//     println(message)
// }
// fun main() {
//     printMessage("Hello, Kotlin!")
// }

//  3 parameters
// In Kotlin, parameters are the values that are passed to a function when the function is called. For example, in the following function definition, a and b are parameters:
// fun add(a: Int, b: Int): Int {
//     return a + b
// }
// for eg aapan ne kam kese karna hai o to bta diya but kis value pe karna hai o nhi bta diya to o value jo bhi hoga o parameter hoga function ke liy   --> add(5, 3) --> 5 and 3 are the parameters of the function add 

// 4 Short circuiting 

// Short-circuiting is a technique used in programming to improve the performance of logical operations. In Kotlin, the && and || operators use short-circuiting. When using the && operator, if the first operand is false, the second operand is not evaluated because the result will always be false. Similarly, when using the || operator, if the first operand is true, the second operand is not evaluated because the result will always be true.

// 5 // type casting   --> type casting is a way to convert one data type to another data type it have two types 


// 1 implicit type casting
// 2 explicit type casting


//   1. implicit type casting --> implicit type casting is done by the compiler itself. For example, if you assign an integer value to a double variable, the compiler will automatically convert the integer to a double.
// // 2. explicit type casting --> explicit type casting is done by the programmer. For example, if you want to convert a double to an integer, you can use the toInt() function.

// 6 concatenation --> concatenation is a way to join two or more strings together. In Kotlin, you can use the + operator to concatenate strings. For example:
// fun main() {
//     var firstName = "John"
//     var lastName = "Doe"
//     var fullName = firstName + " " + lastName
//     println(fullName)  // Prints "John Doe"
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

