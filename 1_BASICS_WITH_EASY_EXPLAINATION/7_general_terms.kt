// 1 string templateing
// 2 parameters
// 3 Short circuiting
<<<<<<< HEAD
// 4 type casting
// 5 concatenation

=======
// 4 type casting (Type Conversion)
// 5 concatenation
// 6 Character escape
 
 
>>>>>>> b27f364b03873ee7f5f11ccb27823ba3a0d2b841





// 1 String Templateing

// what is String Templateing? --> String templateing is a way to include the values of the variables in a string 

// for eg

// var name = "Kotlin"
// println("Hello, $name!")
// $name is the variable name which is included in the string and the value of the variable is printed in the output 

<<<<<<< HEAD


// 2parameters
=======
 
//  2 parameters

>>>>>>> b27f364b03873ee7f5f11ccb27823ba3a0d2b841
// In Kotlin, parameters are the values that are passed to a function when the function is called. For example, in the following function definition, a and b are parameters:

// fun add(a: Int, b: Int): Int {
//     return a + b
// }

// for eg aapan ne kam kese karna hai o to bta diya but kis value pe karna hai o nhi bta diya to o value jo bhi hoga o parameter hoga function ke liy   --> add(5, 3) --> 5 and 3 are the parameters of the function add 

// 3 Short circuiting 

// Short-circuiting is a technique used in programming to improve the performance of logical operations. In Kotlin, the && and || operators use short-circuiting. When using the && operator, if the first operand is false, the second operand is not evaluated because the result will always be false. Similarly, when using the || operator, if the first operand is true, the second operand is not evaluated because the result will always be true.

<<<<<<< HEAD
// 4 type casting   --> type casting is a way to convert one data type to another data type it have two types 
=======
>>>>>>> b27f364b03873ee7f5f11ccb27823ba3a0d2b841

// 4 type casting   --> 

// type casting is a way to convert one data type to another data type it have two types 

// 1 implicit type casting
// 2 explicit type casting


//   1. implicit type casting --> implicit type casting is done by the compiler itself. For example, if you assign an integer value to a double variable, the compiler will automatically convert the integer to a double.

<<<<<<< HEAD
// 5   concatenation --> concatenation is a way to join two or more strings together. In Kotlin, you can use the + operator to concatenate strings. For example:
=======
// 2. explicit type casting --> explicit type casting is done by the programmer. For example, if you want to convert a double to an integer, you can use the toInt() function.


// 5 concatenation --> concatenation is a way to join two or more strings together. In Kotlin, you can use the + operator to concatenate strings. For example:
>>>>>>> b27f364b03873ee7f5f11ccb27823ba3a0d2b841
// fun main() {
//     var firstName = "John"
//     var lastName = "Doe"
//     var fullName = firstName + " " + lastName
//     println(fullName)  // Prints "John Doe"
// }


<<<<<<< HEAD
 
=======
// 6 Character escape

// In Kotlin, character escape sequences are used to represent special characters within strings or characters literals. These escape sequences start with a backslash `\` followed by a specific character or sequence that represents a special character. Here are some common character escape sequences in Kotlin:

// 1. `\n`: Represents a newline character.
// 2. `\t`: Represents a tab character.
// 3. `\r`: Represents a carriage return character.
// 4. `\'`: Represents a single quote character.
// 5. `\"`: Represents a double quote character.
// 6. `\\`: Represents a backslash character.
>>>>>>> b27f364b03873ee7f5f11ccb27823ba3a0d2b841

// Here's an example to illustrate the usage of character escape sequences in Kotlin:

 
// CODE

fun main() {
    // Using escape sequences in a string
    val message = "Hello\nWorld!"  // \n represents a newline
    println(message)

    // Using escape sequences in a character literal
    val singleQuote = '\''  // Represents a single quote character
    println(singleQuote)

    // Using multiple escape sequences in a string
    val multipleEscapes = "First line\nSecond line\tTabbed"  // \n for newline, \t for tab
    println(multipleEscapes)
}
 

// see output and getlogic
 

// In this example:

// - `\n` is used to insert a newline character in the string `"Hello\nWorld!"`, causing the output to display "Hello" on one line and "World!" on the next line.
// - `\'` is used to insert a single quote character into the variable `singleQuote`.
// - `\n` and `\t` are used in the string `"First line\nSecond line\tTabbed"` to insert a newline and a tab, respectively, creating formatted output.



 



 